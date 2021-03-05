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

insert  into `biyexuexiaobiao`(`schoolid`,`name`,`school1`,`school2`,`school3`) values (1,'清华大学',NULL,NULL,NULL),(2,'北京大学',NULL,NULL,NULL),(3,'浙江大学',NULL,NULL,NULL);

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

insert  into `bumenbiao`(`bid`,`bname`,`blei`,`b1`,`b2`,`b3`) values (1,'管理部',0,NULL,NULL,NULL),(2,'销售部',0,NULL,NULL,NULL),(3,'维修部',0,NULL,NULL,NULL),(4,'管理一组',1,'管理部',NULL,NULL),(5,'管理二组',1,'管理部',NULL,NULL),(6,'销售一组',2,'销售部',NULL,NULL),(7,'销售二组',2,'销售部',NULL,NULL),(8,'维修一组',3,'维修部',NULL,NULL),(9,'维修二组',3,'维修部',NULL,NULL);

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

insert  into `car`(`carnum`,`platename`,`carbrandid`,`driver`,`driverphone`,`birthday`,`caraffiliationid`,`driveraddress`,`drivingouttime`,`framnum`,`enginenum`,`engineid`,`carnyear`,`mileage`,`load`,`carseries`,`buytime`,`uptime`,`carouttime`,`mlicompanyid`,`mliouttime`,`cicompanyid`,`ciouttime`,`mytoucar`,`twotime`,`oiltypeid`,`nextmileage`,`nextupkeeptime`,`membernum`,`customernum`,`car1`,`car2`,`car3`) values (12,'吉',1,'1','1','2020-05-06',1,'ghfh',NULL,'df','1',2,NULL,NULL,NULL,NULL,NULL,NULL,NULL,2,NULL,2,NULL,'否',NULL,1,NULL,NULL,NULL,'adsdsa',NULL,NULL,NULL),(13,'津',1,'1','1','2020-05-06',1,'gfh',NULL,'df','1',2,NULL,NULL,NULL,NULL,NULL,NULL,NULL,2,NULL,2,NULL,'否',NULL,1,NULL,NULL,NULL,'132',NULL,NULL,NULL),(14,'沪',1,'1','1','2020-05-06',1,'gj',NULL,'cx','1',2,NULL,NULL,NULL,NULL,NULL,'cxz',NULL,2,NULL,2,NULL,'否',NULL,1,NULL,NULL,NULL,'sad',NULL,NULL,NULL),(2,'辽',1,'1','1','2020-05-06',2,'gfh',NULL,'df','1',1,NULL,NULL,NULL,NULL,NULL,NULL,NULL,2,NULL,1,NULL,'否',NULL,1,NULL,NULL,NULL,'cx',NULL,NULL,NULL),(1,'辽cxzcxz',113,'1','2','2020-05-06',2,'xccxz',NULL,'df','1',2,NULL,NULL,NULL,NULL,NULL,NULL,NULL,1,NULL,1,NULL,'是',NULL,1,NULL,NULL,NULL,'43020219690113','s','c','z'),(11,'赣',1,'1','1','2020-05-06',1,'hgj',NULL,'df','1',2,NULL,NULL,NULL,NULL,NULL,NULL,NULL,2,NULL,2,NULL,'否',NULL,1,NULL,NULL,NULL,'43020219690113',NULL,NULL,NULL);

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

insert  into `caraffiliation`(`caraffiliationid`,`caraffiliation`,`cf1`,`cf2`,`cf3`) values (1,'个人车',NULL,NULL,NULL),(2,'公司车',NULL,NULL,NULL),(3,'租赁车',NULL,NULL,NULL);

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

insert  into `carbrand`(`carcoding`,`brandname`,`initial`,`brand1`,`brand2`,`brand3`) values ('113','中国重汽','A',NULL,NULL,NULL),('2','2','2',NULL,NULL,NULL),('502','中国一汽','K',NULL,NULL,NULL);

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
) ENGINE=MyISAM AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

/*Data for the table `cashier` */

insert  into `cashier`(`id`,`totalNum`,`cashierstatic`,`paymentType`,`invoiceNo`,`cashiertime`,`staffId`,`onCredit`,`interior`,`clientId`,`change`,`Number`,`otherone`,`othertwo`,`otherthree`,`otherfour`,`otherfive`) values (1,1000,'已支付','现金',NULL,'2020-02-11 20:13:52','1',NULL,NULL,'',NULL,'RNG202002','1',NULL,NULL,NULL,NULL),(2,2000,'已支付','微信',NULL,'2020-02-11 20:16:28','2',NULL,NULL,'00000CU12350',NULL,'RNG202002','1',NULL,NULL,NULL,NULL),(3,5000,'已支付','支付宝',NULL,'2020-02-11 20:17:41','3',NULL,NULL,'00000CU12353',NULL,'IG202002','2',NULL,NULL,NULL,NULL),(13,50.49,'正常结算','现金',NULL,'2021-03-02 06:13:49',NULL,NULL,NULL,'胡召文',9.51,'RNG202001','1',NULL,NULL,NULL,NULL);

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

insert  into `chengshibiao`(`qcityid`,`qcityname`,`q1`,`q2`,`q3`) values (1,'北京',NULL,NULL,NULL);

/*Table structure for table `chexingdingyibiao` */

DROP TABLE IF EXISTS `chexingdingyibiao`;

CREATE TABLE `chexingdingyibiao` (
  `cid` int(11) DEFAULT NULL COMMENT '车型品牌',
  `cname` varchar(100) DEFAULT NULL COMMENT '车型名称',
  `jingkoumingchang` varchar(100) DEFAULT NULL COMMENT '进口国产',
  `chankaojiage` double DEFAULT NULL COMMENT '产考价格',
  `cheliangniankuan` double DEFAULT NULL COMMENT '车辆年款',
  `gonglv` int(11) DEFAULT NULL COMMENT '功率',
  `ranyoubianhao` int(11) DEFAULT NULL COMMENT '燃油编号',
  `zaizhong` int(11) DEFAULT NULL COMMENT '载重',
  `fadingjipingpai` varchar(100) DEFAULT NULL COMMENT '发动机品牌',
  `cheid` int(100) NOT NULL AUTO_INCREMENT COMMENT '备用字段',
  `c2` varchar(100) DEFAULT NULL COMMENT ' 备用字段',
  `c3` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `zhaopian` varchar(100) DEFAULT NULL COMMENT '照片',
  PRIMARY KEY (`cheid`)
) ENGINE=MyISAM AUTO_INCREMENT=45646 DEFAULT CHARSET=utf8;

/*Data for the table `chexingdingyibiao` */

insert  into `chexingdingyibiao`(`cid`,`cname`,`jingkoumingchang`,`chankaojiage`,`cheliangniankuan`,`gonglv`,`ranyoubianhao`,`zaizhong`,`fadingjipingpai`,`cheid`,`c2`,`c3`,`zhaopian`) values (2,'2','2',2,2,2,2,2,'2',2,'2','2','2'),(3,'3','3',3,3,3,3,3,'3',3,'3','3','3'),(113,'1','1',1,1,1,1,1,'1',1,'1','1','1'),(2,'2','2',2,2,2,2,2,'2',6,'2','2','2'),(2,'45','国产',45,45,45,45,45,'3号发动机',545,'444',NULL,'5e42d29b-1c83-4328-a32f-38784d1c4b5f.png'),(2,'9','进口',9,9,9,9,9,'99',9,'9',NULL,''),(4,'3','进口',4444,444,444,444,4444,'11',15,'444',NULL,'fda94dc7-187c-4e62-bf8c-dbaabd7f485b.jpg'),(5,'444','进口',4444,444,45,4444,45,'66',4444,'454',NULL,'b89fa9eb-4dc3-4085-a411-684fd6e3d970.jpg'),(2,'121','合资',21,12,12,21,12,'2号发动机',121,'cxz',NULL,'1c2ad6ac-c769-4081-9b16-9b008b8f79b7.png'),(5,'123','国产',5464,456,465,456,456,'4号发动机',123,'cxz',NULL,'4ce508ca-84cb-4a97-9fb5-2e5e3c6216c4.jpg'),(5,'456','国产',456,456,456,456,465,'5号发动机',45645,'cxz',NULL,'c5a93f13-2b1b-4305-a7e7-71184f522464.jpg'),(4,'99','国产',99,99,99,99,99,'2号发动机',9999,'cxz',NULL,'4a978a43-a05c-4113-96e4-89c855dc13db.jpg');

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

insert  into `cicompany`(`cicompanyid`,`cicompany`,`cm1`,`cm2`,`cm3`) values (1,'阳光保险',NULL,NULL,NULL),(2,'中华联合保险公司',NULL,NULL,NULL),(3,'中国平安保险',NULL,NULL,NULL),(4,'太平洋保险',NULL,NULL,NULL);

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
) ENGINE=MyISAM AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

/*Data for the table `completed` */

insert  into `completed`(`id`,`yesOrno`,`predicttime`,`nowtime`,`reason`,`workid`,`dutyid`,`price`,`count`,`fgreason`,`wjid`,`otherone`,`othertwo`,`otherthree`,`otherfour`,`otherfive`) values (14,1,'2021-03-02 00:00:00','2021-03-02 00:00:00','出现意外','1','1',0,0,NULL,'WZL20210302110920',NULL,NULL,NULL,NULL,NULL),(13,1,'2021-03-02 00:00:00','2021-03-02 00:00:00','出现意外','1','1',0,0,NULL,'WZL20210302105640',NULL,NULL,NULL,NULL,NULL),(15,1,'2021-03-02 00:00:00','2021-03-02 00:00:00','出现意外','1','1',0,0,NULL,'WZL20210302111211',NULL,NULL,NULL,NULL,NULL),(16,0,'2021-03-04 00:00:00','2021-03-04 00:00:00',NULL,NULL,'1',10,1,'出现意外','WZL20210304114832',NULL,NULL,NULL,NULL,NULL);

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

insert  into `customer`(`customernum`,`customername`,`customeraddress`,`linkman`,`phone`,`birthday`,`customertypeid`,`customernumber`,`jointime`,`outtime`,`remark`,`filing`,`counselorid`,`paytime`,`payment`,`integral`,`earnest`,`paytest`,`registerphone`,`desportbank`,`bankaccount`,`registeraddress`,`otherone`,`othertwo`,`otherthree`,`otherfour`,`photo`,`qcityid`,`cs1`,`cs2`,`cs3`) values ('1','1','1','1','1','1','1','1','1','1','1','1',1,1,1,1,1,'1','1','1','1','1','1','1',NULL,NULL,NULL,NULL,NULL,NULL,NULL),('43020219690113','胡召文','北京','林子豪sd','15573321655','1995-07-24','1','15573321655','2019-08-04','2021-08-04','5','2019-07-24',1,0,0,200,0,'6','6','8','9','10','11','12','13','14',NULL,1,NULL,NULL,NULL);

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

insert  into `customertype`(`customerid`,`customertype`,`cus1`,`cus2`,`cus3`) values (1,'1','1','1','1');

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

insert  into `earning`(`earningid`,`earningname`,`ear1`,`car2`,`car3`) values (1,'工时费',NULL,NULL,NULL),(2,'燃油费',NULL,NULL,NULL),(3,'代办费',NULL,NULL,NULL),(4,'其他费',NULL,NULL,NULL);

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
) ENGINE=MyISAM AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

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

insert  into `fadongjipinpaibiao`(`fid`,`fname`,`f1`,`f2`,`f3`) values (3,'3号发动机',NULL,NULL,NULL),(2,'2号发动机',NULL,NULL,NULL),(1,'1号发动机',NULL,NULL,NULL),(4,'4号发动机',NULL,NULL,NULL),(6,'5号发动机',NULL,NULL,NULL);

/*Table structure for table `field` */

DROP TABLE IF EXISTS `field`;

CREATE TABLE `field` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `width` int(11) DEFAULT NULL,
  `name` varchar(50) DEFAULT NULL,
  `zname` varchar(50) DEFAULT NULL,
  `display` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=35 DEFAULT CHARSET=utf8;

/*Data for the table `field` */

insert  into `field`(`id`,`width`,`name`,`zname`,`display`) values (1,100,'部门代码','a1','0'),(2,100,'部门名称','a1','0'),(3,100,'工号','a1','0'),(4,100,'姓名','a1','0'),(5,100,'性别','a1','0'),(6,100,'岗位名称','a1','1'),(7,100,'身体状况','a1','1'),(8,100,'身高','a1','1'),(9,100,'籍贯','a1','1'),(10,100,'民族','a1','1'),(11,100,'婚姻状况','a1','1'),(12,100,'学历','a1','1'),(13,100,'毕业学校','a1','1'),(14,100,'专业','a1','0'),(15,100,'专业资格','a1','0'),(16,100,'学位','a1','0'),(17,100,'编制','a1','0'),(18,100,'身份证号','a1','0'),(19,100,'户口地址','a1','0'),(20,100,'邮编','a1','0'),(21,100,'现住地址','a1','0'),(22,100,'邮编','a1','0'),(23,100,'联系电话','a1','0'),(24,100,'手机','a1','0'),(25,100,'email','a1','0'),(26,100,'紧急情况联系人','a1','0'),(27,100,'联系电话','a1','0'),(28,100,'现在何处','a1','0'),(29,100,'使用到期','a1','0'),(30,100,'入职日期','a1','0'),(31,100,'出生日期','a1','0'),(32,100,'合同开始日期','a1','0'),(33,100,'合同结束日期','a1','0'),(34,100,'登陆账号','a1','0');

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

insert  into `field_vehicles`(`carnumber`,`brand`,`model`,`currentmileage`,`teamid`,`car1`,`car2`,`car3`) values ('3','3','1',2,'1',NULL,NULL,NULL);

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

insert  into `firm`(`firmid`,`firmnum`,`firmname`,`address`,`business`,`url`,`openbank`,`bankaccount`,`paymentid`,`firmgradeid`,`managebrand`,`firmtypeid`,`linkmanid`,`debttime`,`remark`,`photo`,`fir1`,`fir2`,`fir3`) values (1,'xczx','cxz',NULL,NULL,'www.4399',NULL,NULL,1,1,'东风',10,1,NULL,NULL,NULL,NULL,NULL,NULL),(3,'cpdd','cxz','北京朝阳区','良好','www.7k7k.com','建设银行','312',1,1,'藤',20,3,1,'的撒打算打算',NULL,NULL,NULL,NULL);

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

insert  into `firmgrade`(`firmgradeid`,`firmgrade`,`fir1`,`fir2`,`fir3`) values (1,'高级',NULL,NULL,NULL);

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

insert  into `firmtype`(`firmtypeid`,`firmtype`,`dadid`,`fir1`,`fir2`,`fir3`) values (10,'北京',0,NULL,NULL,NULL),(20,'上海',0,NULL,NULL,NULL),(30,'湖南',0,NULL,NULL,NULL),(1001,'s',10,NULL,NULL,NULL);

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

insert  into `gangweibiao`(`gid`,`gname`,`g1`,`g2`,`g3`) values (1,'总经理',NULL,NULL,NULL),(2,'人事经理',NULL,NULL,NULL),(3,'项目总监',NULL,NULL,NULL),(4,'项目经理1','','',''),(5,'总裁','','','');

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
) ENGINE=MyISAM AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

/*Data for the table `getgood` */

insert  into `getgood`(`id`,`goodid`,`count`,`item`,`priceType`,`discountsPrice`,`wjid`,`warehouse`,`isRepair`,`cause`,`type`,`otherone`,`othertwo`,`otherthree`,`otherfour`,`otherfive`) values (1,1,1,NULL,'自费','1','WZL20210225093209',NULL,NULL,'','领料',NULL,NULL,NULL,NULL,NULL),(2,1,1,NULL,'自费','1','WZL20210225100229',NULL,NULL,'','领料',NULL,NULL,NULL,NULL,NULL),(3,1,1,NULL,'自费','1','WZL20210225102325',NULL,NULL,'','领料',NULL,NULL,NULL,NULL,NULL),(4,1,1,NULL,'自费','1','WZL20210225163136',NULL,NULL,'','领料',NULL,NULL,NULL,NULL,NULL),(5,1,1,NULL,'自费','1','WZL20210226101405',NULL,NULL,'','领料',NULL,NULL,NULL,NULL,NULL),(6,NULL,1,NULL,'自费',NULL,'WZL20210226111032',NULL,NULL,'','领料',NULL,NULL,NULL,NULL,NULL),(7,1,1,NULL,'自费','1','WZL20210301101704',NULL,NULL,'','领料',NULL,NULL,NULL,NULL,NULL),(8,1,1,NULL,'自费','1','WZL20210302100348',NULL,NULL,'','领料',NULL,NULL,NULL,NULL,NULL),(9,1,1,NULL,'自费','1','WZL20210302102740',NULL,NULL,'','领料',NULL,NULL,NULL,NULL,NULL),(10,1,1,NULL,'自费','1','WZL20210302104650',NULL,NULL,'','领料',NULL,NULL,NULL,NULL,NULL),(11,1,1,NULL,'自费','1','WZL20210302105640',NULL,NULL,'','领料',NULL,NULL,NULL,NULL,NULL),(12,1,1,NULL,'自费','1','WZL20210302110920',NULL,NULL,'','领料',NULL,NULL,NULL,NULL,NULL),(13,1,1,NULL,'自费','1','WZL20210302111211',NULL,NULL,'','领料',NULL,NULL,NULL,NULL,NULL);

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

insert  into `goodaddress`(`goodaddressid`,`goodaddress`,`good1`,`good2`,`good3`) values (1,'湖南',NULL,NULL,NULL),(2,'北京',NULL,NULL,NULL),(3,'广东',NULL,NULL,NULL);

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

insert  into `goodbigkind`(`goodbigkindid`,`goodbigkindtype`,`previd`,`good1`,`good2`,`good3`) values (1,'1',NULL,NULL,NULL,NULL);

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

insert  into `goodbrand`(`goodbrandid`,`goodbrand`,`good1`,`good2`,`good3`) values (1,'别克',NULL,NULL,NULL),(2,'米其林',NULL,NULL,NULL);

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

insert  into `gooddata`(`gooddataid`,`registershop`,`photoname`,`goodnum`,`goodname`,`goodbrandid`,`fitcartype`,`numunitid`,`goodbigkindid`,`earningid`,`ycfcid`,`goodgradeid`,`goodaddressid`,`firmid`,`ycnum`,`txnum`,`packing`,`volume`,`roughweight`,`suttle`,`raprate`,`exchange`,`paytoid`,`standardprice`,`memberprice`,`vipprice`,`protocol`,`claimprice`,`insuranceprice`,`good1`,`good2`,`good3`) values (1,1,'1','456645','喷油嘴',1,'JN-5',1,1,1,2,1,1,1,'1','1','1','1','1','1','1','1',1,1,1,1,1,1,1,'10',NULL,NULL);

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

insert  into `goodgrade`(`goodgradeid`,`goodgrade`,`good1`,`good2`,`good3`) values (1,'A级',NULL,NULL,NULL),(2,'B级',NULL,NULL,NULL),(3,'C级',NULL,NULL,NULL);

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

insert  into `hunyingzhuangtaibiao`(`marriageid`,`name`,`mar1`,`mar2`,`mar3`) values (1,'已婚',NULL,NULL,NULL),(2,'未婚',NULL,NULL,NULL);

/*Table structure for table `item_repair` */

DROP TABLE IF EXISTS `item_repair`;

CREATE TABLE `item_repair` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `isRepair` int(11) DEFAULT NULL COMMENT '是救援还是维修，救援=0',
  `wjid` varchar(20) DEFAULT NULL COMMENT '救援或者维修表id',
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
) ENGINE=MyISAM AUTO_INCREMENT=24 DEFAULT CHARSET=utf8;

/*Data for the table `item_repair` */

insert  into `item_repair`(`id`,`isRepair`,`wjid`,`itemid`,`teamid`,`count`,`priceType`,`otherone`,`othertwo`,`otherthree`,`otherfour`,`otherfive`) values (23,NULL,'WZL20210304114832',10001,1,1,'自费',NULL,NULL,NULL,NULL,NULL),(22,NULL,'WZL20210302144137',10001,1,1,'自费',NULL,NULL,NULL,NULL,NULL),(21,NULL,'WZL20210302135209',10001,1,1,'自费',NULL,NULL,NULL,NULL,NULL),(20,NULL,'WZL20210302111211',10001,1,1,'免单',NULL,NULL,NULL,NULL,NULL),(19,NULL,'WZL20210302110920',10001,1,1,'自费',NULL,NULL,NULL,NULL,NULL),(18,NULL,'WZL20210302105640',10001,1,1,'自费',NULL,NULL,NULL,NULL,NULL);

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

insert  into `jiguanbiao`(`jnativplaceid`,`jname`,`j1`,`j2`,`j3`) values (1,'北京',NULL,NULL,NULL),(2,'上海',NULL,NULL,NULL),(3,'广州',NULL,NULL,NULL),(4,'深圳',NULL,NULL,NULL);

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

insert  into `jinkouguochang`(`jid`,`jname`,`j1`,`j2`,`j3`) values (1,'国产',NULL,NULL,NULL),(2,'进口',NULL,NULL,NULL),(3,'合资',NULL,NULL,NULL),(4,'非洲',NULL,NULL,NULL);

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

insert  into `linkman`(`linkmanid`,`linkman`,`position`,`phone`,`telephone`,`email`,`link1`,`link2`,`link3`) values (1,'ssss',NULL,'44444','222','4456',NULL,NULL,NULL),(3,'林总',NULL,'2131','213','123',NULL,NULL,NULL);

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

insert  into `lizhiyuanyingbiao`(`ytime`,`yreason`,`yid`,`y1`,`y2`,`y3`) values ('2018-8-9','没钱',2,NULL,NULL,NULL),('2018-8-9','没钱',2,NULL,NULL,NULL);

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

insert  into `maintenance_team`(`teamid`,`teamname`,`teamweight`,`classificationid`,`tem1`,`tem2`,`tem3`) values ('1','华山队','0.5','10',NULL,NULL,NULL),('2','4','2','11','','','');

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

insert  into `maintenance_team_classification`(`classificationid`,`classificationname`,`class1`,`class2`,`class3`) values ('11','啊啊',NULL,NULL,NULL),('10','自建',NULL,NULL,NULL);

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

/*Table structure for table `menu` */

DROP TABLE IF EXISTS `menu`;

CREATE TABLE `menu` (
  `menuid` int(11) NOT NULL COMMENT '菜单id',
  `menuname` varchar(50) DEFAULT NULL COMMENT '菜单名称',
  `fmid` int(11) DEFAULT NULL COMMENT '父菜单id',
  PRIMARY KEY (`menuid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='菜单表';

/*Data for the table `menu` */

insert  into `menu`(`menuid`,`menuname`,`fmid`) values (10,'发动机',0),(11,'传动系统',0),(100,'发动机总成',10),(101,'机体组',10),(102,'泵',10),(105,'离合器',11),(1000,'汽油发动机',100),(1001,'柴油发动机',100),(1006,'离合器器压片',105),(1021,'水泵',102);

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

insert  into `mingzubiao`(`nationid`,`name`,`nat1`,`nat2`,`nat3`) values (1,'汉',NULL,NULL,NULL),(2,'满',NULL,NULL,NULL),(3,'蒙',NULL,NULL,NULL),(4,'苗',NULL,NULL,NULL),(5,'壮',NULL,NULL,NULL);

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

insert  into `mlicompany`(`mlicompanyid`,`mlicompany`,`mli1`,`mli2`,`mli3`) values (1,'阳光保险',NULL,NULL,NULL),(2,'夕阳红保险',NULL,NULL,NULL),(3,'中国商业险',NULL,NULL,NULL);

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

insert  into `numunit`(`numunitid`,`numunit`,`num1`,`num2`,`num3`) values (1,'个',NULL,NULL,NULL),(2,'件',NULL,NULL,NULL),(3,'把',NULL,NULL,NULL);

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

insert  into `oiltype`(`oiltypeid`,`oiltype`,`o1`,`o2`,`o3`) values (1,'石油',NULL,NULL,NULL);

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

insert  into `payment`(`paymentid`,`payment`,`pay1`,`pay2`,`pay3`) values (1,'货到付款',NULL,NULL,NULL),(2,'货前付款',NULL,NULL,NULL);

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

insert  into `payto`(`paytoid`,`payto`,`pay1`,`pay2`,`pay3`) values (1,'售价表',NULL,NULL,NULL),(2,'加价表',NULL,NULL,NULL);

/*Table structure for table `pb` */

DROP TABLE IF EXISTS `pb`;

CREATE TABLE `pb` (
  `id` int(11) DEFAULT NULL,
  `name` varchar(300) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `pb` */

insert  into `pb`(`id`,`name`) values (1,'轻度'),(2,'中度'),(3,'重度');

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

insert  into `pinpaichexing`(`pid`,`pname`,`shouzimu`,`p1`,`p2`,`p3`) values (5,'宝马','5',NULL,NULL,NULL),(4,'大众','4',NULL,NULL,NULL),(2,'中国重汽','Z','','',''),(6,'奔驰','6','','','');

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

insert  into `platenumber`(`plateid`,`platename`,`pla1`,`pla2`,`pla3`) values (1,'京',NULL,NULL,NULL),(2,'沪',NULL,NULL,NULL),(3,'津',NULL,NULL,NULL),(4,'鲁',NULL,NULL,NULL),(5,'冀',NULL,NULL,NULL),(6,'晋',NULL,NULL,NULL),(7,'蒙',NULL,NULL,NULL),(8,'辽',NULL,NULL,NULL),(9,'吉',NULL,NULL,NULL),(10,'黑',NULL,NULL,NULL),(11,'苏',NULL,NULL,NULL),(12,'浙',NULL,NULL,NULL),(13,'皖',NULL,NULL,NULL),(14,'闽',NULL,NULL,NULL),(15,'赣',NULL,NULL,NULL),(16,'豫',NULL,NULL,NULL),(17,'鄂',NULL,NULL,NULL),(18,'苏',NULL,NULL,NULL),(19,'湘',NULL,NULL,NULL),(20,'粤',NULL,NULL,NULL),(21,'桂',NULL,NULL,NULL),(22,'琼',NULL,NULL,NULL);

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

insert  into `repair`(`number`,`carinfoId`,`staffno`,`oil`,`type`,`worktime`,`getman`,`overworkdate`,`nowworkDate`,`setter`,`company`,`befor`,`price`,`remark`,`state`,`fault`,`faultreasult`,`status`,`orderTime`,`stockDater`,`otherone`,`othertwo`,`otherthree`,`otherfour`,`otherfive`) values ('WZL20210304114832',11,'1','1/2','陕汽重卡','白天','超级管理员','2021-03-04 00:00:00',NULL,'现结','hggh','2021-03-01 00:00:00',80,'jh','fgg','fgg','fgg','进行中','2021-03-01 00:00:00',NULL,NULL,NULL,NULL,NULL,NULL),('WZL20210302135209',1,'1','1/2','中国重汽','夜晚','超级管理员','2021-03-02 00:00:00','2021-03-02 16:16:09','现结','fg','2021-03-01 00:00:00',80,'dg','fg','fg','fg','进行中','2021-03-01 00:00:00',NULL,NULL,NULL,NULL,NULL,NULL),('WZL20210302144137',11,'1','1/2','中国重汽','白天','超级管理员','2021-03-02 14:43:01','2021-03-02 14:43:05','现结','gfh','2021-03-02 14:43:14',80,'fdg','fdgh','fdgh','fdgh','进行中','2021-03-02 14:43:20',NULL,NULL,NULL,NULL,NULL,NULL),('RNG202001',1,'1','1/2','陕汽重卡','白天','超级管理员','2021-03-01 13:14:08','2021-03-02 13:14:14','现结','hg','2021-03-01 13:14:33',50,'fh','ghg','ghg','kk','完工','2021-03-01 13:15:10',NULL,NULL,NULL,NULL,NULL,NULL),('WZL20210302111211',1,'3','1/2','中国重汽','白天','超级管理员','2021-03-02 16:16:13','2021-03-02 00:00:00','现结','hg','2021-03-01 00:00:00',1,'fh','ghg','ghg','ghg','进行中','2021-03-01 00:00:00',NULL,NULL,NULL,NULL,NULL,NULL),('WZL20210302110920',1,'4','1/2','中国重汽','白天','超级管理员','2021-03-02 00:00:00','2021-03-02 00:00:00','现结','ujk','2021-03-01 00:00:00',81,'jkh','jk','jk','jk','完工','2021-03-01 00:00:00',NULL,NULL,NULL,NULL,NULL,NULL),('WZL20210302105640',1,'1','1/2','中国重汽','白天','超级管理员','2021-03-02 00:00:00','2021-03-02 00:00:00','现结','kllk','2021-03-02 13:45:59',81,'jkk','kjjk','kjjk','kjjk','完工','2021-03-02 11:08:08',NULL,NULL,NULL,NULL,NULL,NULL);

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
  `menu_name` varchar(50) NOT NULL COMMENT '菜单名称',
  `parent_id` int(11) DEFAULT NULL COMMENT '父菜单ID',
  `order_num` int(11) DEFAULT NULL COMMENT '显示顺序',
  `url` varchar(200) DEFAULT NULL COMMENT '请求地址',
  `menu_type` char(1) DEFAULT NULL COMMENT '菜单类型',
  `visible` char(1) DEFAULT NULL COMMENT '菜单状态',
  `perms` varchar(100) DEFAULT NULL COMMENT '权限标识',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `remark` varchar(500) DEFAULT NULL COMMENT '备注',
  `men1` varchar(200) DEFAULT NULL COMMENT '当作ename来使用',
  `men2` varchar(200) DEFAULT NULL COMMENT '备用列',
  `men3` varchar(200) DEFAULT NULL COMMENT '备用列',
  PRIMARY KEY (`menu_id`)
) ENGINE=MyISAM AUTO_INCREMENT=168 DEFAULT CHARSET=utf8;

/*Data for the table `sys_menu` */

insert  into `sys_menu`(`menu_id`,`menu_name`,`parent_id`,`order_num`,`url`,`menu_type`,`visible`,`perms`,`create_time`,`remark`,`men1`,`men2`,`men3`) values (1,'服务接待',0,1,'','M','0','fwjd111','2021-02-23 00:00:00','','fwjd1','',''),(3,'结算中心',0,2,'','M','0','jszx11','2021-02-23 00:00:00','','jszx1','',''),(4,'客户档案',0,3,'','M','0','khda1111','2021-02-23 00:00:00','','khda1','',''),(5,'基础数据',0,4,NULL,'M','0','jcsj111','2021-02-23 08:58:52',NULL,'jcsj1',NULL,NULL),(40,'商品删除',21,35,NULL,'B','0',NULL,NULL,NULL,NULL,'firm/remove',NULL),(7,'行政人事',0,5,NULL,'M','0','xzrs111','2021-02-23 08:59:17',NULL,'xzrs1',NULL,NULL),(8,'服务接待',1,7,NULL,'D','0','fwjd21111','2021-02-23 09:00:24',NULL,'fwjd2',NULL,NULL),(9,'维修接车',8,8,'wxjc/maintain.html','C','0','wxjc1','2021-04-01 09:00:38',NULL,'wxjc',NULL,NULL),(10,'竣工检验',8,9,'wxjc/checked.html','C','0','jgjy1','2021-02-23 09:01:11',NULL,'jgjy',NULL,NULL),(11,'前台结算',3,10,NULL,'D','0','qtjs211','2021-02-23 09:01:22',NULL,'qtjs2',NULL,NULL),(12,'结算中心',11,11,'jszxym/jszx.html','C','0','jszx1','2021-02-23 09:01:38',NULL,'jszx',NULL,NULL),(44,'查询',15,12,NULL,'B','0',NULL,NULL,NULL,NULL,'user/query',NULL),(14,'客户档案',4,13,NULL,'D','0','khda21','2021-02-23 09:02:10',NULL,'khda2',NULL,NULL),(15,'客户资料',14,14,'kehudangan.html','C','0','khzl1','2021-02-23 09:02:27',NULL,'khzl',NULL,NULL),(16,'车辆资料',14,15,'cheliang.html','C','0','clzl1','2021-02-23 09:02:42',NULL,'clzl',NULL,NULL),(17,'主数据',5,16,NULL,'D','0','zsj1111','2021-02-23 09:02:56',NULL,'zsj',NULL,NULL),(18,'发动机品牌',17,17,'fdj.html','C','0','fdjpp1','2021-02-23 09:03:12',NULL,'fdjpp',NULL,NULL),(19,'车型档案',17,18,'cxda.html','C','0','cxda1','2021-02-23 09:06:07',NULL,'cxda',NULL,NULL),(20,'维修项目',17,19,'wxxm.html','C','0','wxxm1','2021-02-23 09:06:23',NULL,'wxxm',NULL,NULL),(21,'商品资料',17,20,'sp.html','C','0','spzl1','2021-02-23 09:07:06',NULL,'spzl',NULL,NULL),(22,'供货单位',17,21,'gonghuodanwei.html','C','0','ghdw11','2021-02-23 09:07:22',NULL,'ghdw',NULL,NULL),(23,'员工资料',7,22,NULL,'D','0','ygzl1','2021-02-23 09:08:03',NULL,'ygzl',NULL,NULL),(24,'组织机构',23,23,'zuzhi.html','C','0','zzjg1','2021-02-23 09:08:29',NULL,'zzjg',NULL,NULL),(25,'岗位定义',23,24,'gang.html','C','0','gwdy11','2021-02-23 09:08:41',NULL,'gwdy',NULL,NULL),(26,'离职登记',23,25,'lizhi.html','C','0','lzdj1','2021-02-23 09:08:56',NULL,'lzdj',NULL,NULL),(27,'通讯名录',23,26,'phone.html','C','0','txml11','2021-02-23 09:09:12',NULL,'txml',NULL,NULL),(28,'技工管理',7,27,NULL,'D','0','jggl1','2021-02-23 09:09:27',NULL,'jggl',NULL,NULL),(29,'技工星级',28,28,'jigongxingji.html','C','0','jgxj1111','2021-02-23 09:10:25',NULL,'jgxj',NULL,NULL),(30,'班组技工',28,29,'banzujigong.html','C','0','bzjg1','2021-02-23 09:10:27',NULL,'bzjg',NULL,NULL),(31,'外勤车辆',28,30,'waiqingcheliang.html','C','0','wqcl11','2021-02-23 09:10:29',NULL,'wqcl',NULL,NULL),(32,'系统管理',0,6,NULL,'M','0','xtgl111','2021-02-26 00:44:23',NULL,'xtgl',NULL,NULL),(33,'系统管理',32,31,NULL,'D','0','xtgl21','2021-02-26 00:51:00',NULL,'xtgl2',NULL,NULL),(37,'商品添加',21,36,NULL,'B','0',NULL,NULL,NULL,NULL,'firm/add',NULL),(35,'授权管理',33,32,'jsgl.html','C','0','qxgl1111','2021-02-26 00:54:05',NULL,'qxgl',NULL,NULL),(43,'结算查询',12,37,NULL,'B','0',NULL,NULL,NULL,NULL,'settlementCenter/query',NULL),(38,'商品查询',21,38,NULL,'B','0',NULL,NULL,NULL,NULL,'firm/find',NULL),(39,'商品修改',21,39,NULL,'B','0',NULL,NULL,NULL,NULL,'firm/update',NULL),(36,'技工提成',28,33,'jigongtichengbili.html','C','0','jgtc11111',NULL,NULL,NULL,NULL,NULL),(41,'维修接车查询',9,40,NULL,'B','0',NULL,NULL,NULL,NULL,'weixiubiao/query',NULL),(42,'竣工检验查询',10,41,NULL,'B','0',NULL,NULL,NULL,NULL,'jungong/query',NULL),(45,'车辆资料查询',16,42,NULL,'B','0',NULL,NULL,NULL,NULL,'cheliangziliao/query',NULL),(46,'发动机查询',18,43,NULL,'B','0',NULL,NULL,NULL,NULL,'fadongji/query',NULL),(47,'车型档案查询',19,44,NULL,'B','0',NULL,NULL,NULL,NULL,'chexingdanan/query',NULL),(48,'维修项目查询',20,45,NULL,'B','0',NULL,NULL,NULL,NULL,'weixiuxiangmu/query',NULL),(49,'供货单位查询',22,46,NULL,'B','0',NULL,NULL,NULL,NULL,'good/find',NULL),(50,'组织机构查询',24,47,NULL,'B','0',NULL,NULL,NULL,NULL,'zuzhi/cha',NULL),(51,'岗位定义查询',25,48,NULL,'B','0',NULL,NULL,NULL,NULL,'gangweidingyi/query',NULL),(52,'离职登记查询',26,49,NULL,'B','0',NULL,NULL,NULL,NULL,'lizhi/showc',NULL),(53,'通讯名录查询',27,50,NULL,'B','0',NULL,NULL,NULL,NULL,'phone/showc',NULL),(54,'技工星级查询',29,51,NULL,'B','0',NULL,NULL,NULL,NULL,'jigongxingji/query',NULL),(55,'班组技工查询',30,52,NULL,'B','0',NULL,NULL,NULL,NULL,'banzujigong/query',NULL),(56,'外勤车辆查询',31,53,NULL,'B','0',NULL,NULL,NULL,NULL,'waiqincheliang/query',NULL),(57,'授权管理查询',35,54,NULL,'B','0',NULL,NULL,NULL,NULL,'shouquanguanli/query',NULL),(58,'技工提成查询',36,55,NULL,'B','0',NULL,NULL,NULL,NULL,'jigongticheng/query',NULL),(59,'模块管理',33,34,'mokuaiguanli.html','C','0','mkgl11',NULL,NULL,NULL,NULL,NULL),(60,'模块查询',59,56,NULL,'B','0','mkcx',NULL,NULL,NULL,'mokuai/query',NULL),(123,'商品字段设置',21,140,'','B','0','',NULL,'','','firm/zdsz',''),(61,'发动机新增',18,57,NULL,'B','0',NULL,NULL,NULL,NULL,'fdjtoadd',NULL),(62,'发动机删除',18,58,NULL,'B','0',NULL,NULL,NULL,NULL,'fdjremove()',NULL),(63,'发动机保存',18,59,NULL,'B','0',NULL,NULL,NULL,NULL,'fdjcarry',NULL),(64,'发动机导出',18,60,NULL,'B','0',NULL,NULL,NULL,NULL,'fdjdownloadEcxel',NULL),(65,'品牌新增',19,61,NULL,'B','0',NULL,NULL,NULL,NULL,'cxdazjpp',NULL),(66,'品牌修改',19,62,NULL,'B','0',NULL,NULL,NULL,NULL,'cxdaxgpp',NULL),(67,'品牌删除',19,63,NULL,'B','0',NULL,NULL,NULL,NULL,'cxdaremove',NULL),(68,'车型新增',19,64,NULL,'B','0',NULL,NULL,NULL,NULL,'cxdazjcx',NULL),(69,'车型修改',19,65,NULL,'B','0',NULL,NULL,NULL,NULL,'cxdaxgcx',NULL),(70,'车型删除',19,66,NULL,'B','0',NULL,NULL,NULL,NULL,'cxdacheremove',NULL),(71,'维修新增',20,67,NULL,'B','0',NULL,NULL,NULL,NULL,'wxxmaddservice',NULL),(72,'维修项目',20,68,NULL,'B','0',NULL,NULL,NULL,NULL,'wxxmupdateservice',NULL),(73,'调价',20,69,NULL,'B','0',NULL,NULL,NULL,NULL,'wxxmpricechange',NULL),(74,'维修导出',20,70,NULL,'B','0',NULL,NULL,NULL,NULL,'wxxmdownloadEcxel',NULL),(75,'授权',35,71,NULL,'B','0',NULL,NULL,NULL,NULL,'shouquan/shouquan',NULL),(76,'授权新增',35,72,NULL,'B','0',NULL,NULL,NULL,NULL,'shouquan/add',NULL),(77,'授权修改',35,73,NULL,'B','0',NULL,NULL,NULL,NULL,'shouquan/update',NULL),(78,'授权删除',35,74,NULL,'B','0',NULL,NULL,NULL,NULL,'shouquan/remove',NULL),(80,'授权修改1',35,75,NULL,'B','0',NULL,NULL,NULL,NULL,'shouquan/updatee',NULL),(81,'授权1',35,76,NULL,'B','0',NULL,NULL,NULL,NULL,'shouquan/shouquane',NULL),(79,'授权新增1',35,77,NULL,'B','0',NULL,NULL,NULL,NULL,'shouquan/adde',NULL),(82,'模块修改',59,78,NULL,'B','0',NULL,NULL,NULL,NULL,'mokuai/update',NULL),(83,'模块修改1',59,79,NULL,'B','0',NULL,NULL,NULL,NULL,'mokuai/updatee',NULL),(84,'结算导出',12,80,NULL,'B','0',NULL,NULL,NULL,NULL,'settlementCenter/daochu',NULL),(85,'结算收银',12,81,NULL,'B','0',NULL,NULL,NULL,NULL,'settlementCenter/shouying',NULL),(86,'结算打开单据',12,82,NULL,'B','0',NULL,NULL,NULL,NULL,'settlementCenter/dakai',NULL),(87,'岗位增加',25,83,NULL,'B','0',NULL,NULL,NULL,NULL,'gang/add',NULL),(88,'岗位删除',25,84,NULL,'B','0',NULL,NULL,NULL,NULL,'gang/delete',NULL),(89,'岗位保存',25,85,NULL,'B','0',NULL,NULL,NULL,NULL,'gang/update',NULL),(90,'岗位导出',25,86,NULL,'B','0',NULL,NULL,NULL,NULL,'gang/daochu',NULL),(91,'通讯保存',27,87,NULL,'B','0',NULL,NULL,NULL,NULL,'phone/update',NULL),(92,'通讯门店选择',27,88,NULL,'B','0',NULL,NULL,NULL,NULL,'phone/show',NULL),(93,'通讯导出',27,89,NULL,'B','0',NULL,NULL,NULL,NULL,'phone/daochu',NULL),(94,'离职门店选择',26,90,NULL,'B','0',NULL,NULL,NULL,NULL,'lizhi/show',NULL),(95,'离职',26,91,NULL,'B','0',NULL,NULL,NULL,NULL,'lizhi/showl',NULL),(96,'回滚',26,92,NULL,'B','0',NULL,NULL,NULL,NULL,'lizhi/hui',NULL),(97,'离职删除',26,93,NULL,'B','0',NULL,NULL,NULL,NULL,'lizhi/delete',NULL),(98,'离职导出',26,94,NULL,'B','0',NULL,NULL,NULL,NULL,'lizhi/daochu',NULL),(99,'组织删除门店',24,95,NULL,'B','0',NULL,NULL,NULL,NULL,'zuzhi/remove9',NULL),(100,'组织使用门店',24,96,NULL,'B','0',NULL,NULL,NULL,NULL,'zuzhi/show2',NULL),(101,'组织门店编辑',24,97,NULL,'B','0',NULL,NULL,NULL,NULL,'zuzhi/menb',NULL),(102,'组织添加员工',24,98,NULL,'B','0',NULL,NULL,NULL,NULL,'zuzhi/showz',NULL),(103,'组织修改员工',24,99,NULL,'B','0',NULL,NULL,NULL,NULL,'zuzhi/jia1',NULL),(104,'组织删除',24,100,NULL,'B','0',NULL,NULL,NULL,NULL,'zuzhi/removeid',NULL),(105,'组织导出',24,101,NULL,'B','0',NULL,NULL,NULL,NULL,'zuzhi/daochu',NULL),(106,'组织员工角色',24,102,NULL,'B','0',NULL,NULL,NULL,NULL,'zuzhi/yuan',NULL),(107,'组织字段设置',24,103,NULL,'B','0',NULL,NULL,NULL,NULL,'zuzhi/ziduan',NULL),(108,'客户增加车资料',15,104,NULL,'B','0',NULL,NULL,NULL,NULL,'customer/addcar',NULL),(109,'客户修改车资料',15,105,NULL,'B','0',NULL,NULL,NULL,NULL,'customer/updatecar',NULL),(110,'客户删除车资料',15,106,NULL,'B','0',NULL,NULL,NULL,NULL,'customer/remocar',NULL),(111,'客户增加客户和车',15,107,NULL,'B','0',NULL,NULL,NULL,NULL,'customer/addcuscar',NULL),(112,'客户增加客户',15,108,NULL,'B','0',NULL,NULL,NULL,NULL,'customer/addcus',NULL),(113,'客户删除客户',15,109,NULL,'B','0',NULL,NULL,NULL,NULL,'customer/remove',NULL),(114,'客户修改客户',15,110,NULL,'B','0',NULL,NULL,NULL,NULL,'customer/upcus',NULL),(115,'客户导出',15,111,NULL,'B','0',NULL,NULL,NULL,NULL,'customer/dc',NULL),(116,'客户字段设置',15,112,NULL,'B','0',NULL,NULL,NULL,NULL,'customer/zdsz',NULL),(117,'车辆增加',16,113,NULL,'B','0',NULL,NULL,NULL,NULL,'car/add',NULL),(118,'车辆修改',16,114,NULL,'B','0',NULL,NULL,NULL,NULL,'car/update',NULL),(119,'车辆删除',16,115,NULL,'B','0',NULL,NULL,NULL,NULL,'car/remove',NULL),(120,'车辆保养',16,116,NULL,'B','0',NULL,NULL,NULL,NULL,'car/by',NULL),(121,'车辆导出',16,117,NULL,'B','0',NULL,NULL,NULL,NULL,'car/dc',NULL),(122,'车辆字段设置',16,118,NULL,'B','0',NULL,NULL,NULL,NULL,'car/ziduan',NULL),(124,'供货搜索',22,119,NULL,'B','0',NULL,NULL,NULL,NULL,'good/search',NULL),(125,'供货添加',22,120,NULL,'B','0',NULL,NULL,NULL,NULL,'good/add',NULL),(126,'供货修改',22,121,NULL,'B','0',NULL,NULL,NULL,NULL,'good/update',NULL),(127,'供货删除',22,122,NULL,'B','0',NULL,NULL,NULL,NULL,'good/remove',NULL),(128,'供货导出',22,123,NULL,'B','0',NULL,NULL,NULL,NULL,'good/dc',NULL),(129,'供货字段设置',22,124,NULL,'B','0',NULL,NULL,NULL,NULL,'good/zdsz',NULL),(130,'维修删除',20,125,NULL,'B','0',NULL,NULL,NULL,NULL,'wxxmwxremove',NULL),(131,'照片',19,126,NULL,'B','0',NULL,NULL,NULL,NULL,'cxdazp',NULL),(133,'维修接车按钮 ',9,127,NULL,'B','0',NULL,NULL,NULL,NULL,'wxjc',NULL),(134,'救援开单按钮',9,128,NULL,'B','0',NULL,NULL,NULL,NULL,'jykd',NULL),(135,'接车完成按钮',9,129,NULL,'B','0',NULL,NULL,NULL,NULL,'jcwc',NULL),(136,'维修项目新增',9,130,NULL,'B','0',NULL,NULL,NULL,NULL,'dgzj',NULL),(137,'维修项目修改',9,131,NULL,'B','0',NULL,NULL,NULL,NULL,'xg',NULL),(138,'维修项目删除',9,132,NULL,'B','0',NULL,NULL,NULL,NULL,'wxxmsc',NULL),(139,'领料新增',10,133,NULL,'B','0',NULL,NULL,NULL,NULL,'xlxl',NULL),(140,'附加增加',10,134,NULL,'B','0',NULL,NULL,NULL,NULL,'fjzj',NULL),(141,'附加修改',10,135,NULL,'B','0',NULL,NULL,NULL,NULL,'fjxg',NULL),(142,'附加删除',10,136,NULL,'B','0',NULL,NULL,NULL,NULL,'fjsc',NULL),(143,'救援完成',10,137,NULL,'B','0',NULL,NULL,NULL,NULL,'jywc',NULL),(144,'回滚',10,138,NULL,'B','0',NULL,NULL,NULL,NULL,'huigun',NULL),(145,'竣工检查',10,139,NULL,'B','0',NULL,NULL,NULL,NULL,'jungongjiancha',NULL),(146,'增加班组',30,141,NULL,'B','0',NULL,NULL,NULL,NULL,'maintenanceTeam/add',NULL),(147,'修改班组',30,142,NULL,'B','0',NULL,NULL,NULL,NULL,'maintenanceTeam/update',NULL),(148,'删除班组',30,143,NULL,'B','0',NULL,NULL,NULL,NULL,'maintenanceTeam/del',NULL),(149,'增加员工',30,144,NULL,'B','0',NULL,NULL,NULL,NULL,'technicianInformation/add',NULL),(150,'修改员工',30,145,NULL,'B','0',NULL,NULL,NULL,NULL,'technicianInformation/update',NULL),(151,'删除员工',30,146,NULL,'B','0',NULL,NULL,NULL,NULL,'technicianInformation/del',NULL),(152,'导出员工',30,147,NULL,'B','0',NULL,NULL,NULL,NULL,'technicianInformation/down',NULL),(153,'增加技工提成',36,148,NULL,'B','0',NULL,NULL,NULL,NULL,'teamWeight/add',NULL),(154,'删除技工提成',36,149,NULL,'B','0',NULL,NULL,NULL,NULL,'teamWeight/del',NULL),(155,'保存技工提成',36,150,NULL,'B','0',NULL,NULL,NULL,NULL,'teamWeight/update',NULL),(156,'增加技工星级',29,151,NULL,'B','0',NULL,NULL,NULL,NULL,'technicianLevel/add',NULL),(157,'删除技工星级',29,152,NULL,'B','0',NULL,NULL,NULL,NULL,'technicianLevel/del',NULL),(158,'保存技工星级',29,153,NULL,'B','0',NULL,NULL,NULL,NULL,'technicianLevel/update',NULL),(159,'增加外出车辆',31,154,NULL,'B','0',NULL,NULL,NULL,NULL,'fieldVehicles/add',NULL),(160,'删除外出车辆',31,155,NULL,'B','0',NULL,NULL,NULL,NULL,'fieldVehicles/del',NULL),(161,'保存外出车辆',31,156,NULL,'B','0',NULL,NULL,NULL,NULL,'fieldVehicles/update',NULL),(162,'用户管理',33,15,'user.html','C','0','user11',NULL,NULL,NULL,NULL,NULL),(163,'用户查询',162,160,NULL,'B','0',NULL,NULL,NULL,NULL,'users/query',NULL),(164,'用户修改',162,161,NULL,'B','0',NULL,NULL,NULL,NULL,'users/update',NULL),(165,'用户删除',162,162,NULL,'B','0',NULL,NULL,NULL,NULL,'users/delete',NULL),(166,'用户新增',162,163,NULL,'B','0',NULL,NULL,NULL,NULL,'users/add',NULL),(167,'用户授权',162,164,NULL,'B','0',NULL,NULL,NULL,NULL,'users/sq',NULL);

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
) ENGINE=MyISAM AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

/*Data for the table `sys_role` */

insert  into `sys_role`(`role_id`,`role_name`,`status`,`del_flag`,`create_time`,`remark`,`role1`,`role2`,`role3`) values (1,'0','管理员','','2021-02-23','董事长','12345','admin',''),(2,'0','普通管理员','','2021-02-25','生产部经理','12345','user',''),(9,NULL,NULL,NULL,'2021-03-19','财务经理',NULL,NULL,NULL),(8,'0','管理员','','2021-03-04','人事经理','','','');

/*Table structure for table `sys_role_menu` */

DROP TABLE IF EXISTS `sys_role_menu`;

CREATE TABLE `sys_role_menu` (
  `role_id` int(11) DEFAULT NULL COMMENT '角色id',
  `menu_id` int(11) DEFAULT NULL COMMENT '菜单id'
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `sys_role_menu` */

insert  into `sys_role_menu`(`role_id`,`menu_id`) values (1,162),(1,161),(1,160),(1,159),(1,158),(1,157),(1,156),(1,155),(1,154),(1,153),(1,152),(1,151),(1,150),(1,149),(1,148),(1,147),(1,146),(1,145),(1,144),(1,143),(1,142),(1,141),(1,140),(1,139),(1,138),(1,137),(1,136),(1,135),(1,134),(1,133),(1,131),(1,130),(1,129),(1,128),(1,127),(1,126),(1,125),(1,124),(1,123),(1,122),(1,121),(1,120),(1,119),(1,118),(1,117),(1,116),(1,115),(1,114),(1,113),(1,112),(1,111),(1,110),(1,109),(1,108),(1,107),(1,106),(1,105),(1,104),(1,103),(1,102),(1,101),(1,100),(1,99),(1,98),(1,97),(1,96),(1,95),(1,94),(1,93),(1,92),(1,91),(1,90),(1,89),(1,88),(1,87),(1,86),(1,85),(1,84),(1,83),(1,82),(1,81),(1,80),(1,79),(1,78),(1,77),(1,76),(1,75),(1,74),(1,73),(1,72),(1,71),(1,70),(1,69),(1,68),(1,67),(1,66),(1,65),(1,64),(1,63),(1,62),(1,61),(1,60),(1,59),(1,58),(1,57),(1,56),(1,55),(1,54),(1,53),(1,52),(1,51),(1,50),(1,49),(1,48),(1,47),(1,46),(1,45),(1,44),(1,43),(1,42),(1,41),(1,40),(1,39),(1,38),(1,37),(1,36),(1,35),(1,33),(1,32),(1,31),(1,30),(1,29),(1,28),(1,27),(1,26),(1,25),(1,24),(1,23),(1,22),(1,21),(1,165),(1,164),(1,163),(1,20),(1,19),(1,18),(1,17),(1,16),(1,15),(1,14),(1,12),(1,11),(1,10),(1,9),(1,8),(1,7),(1,5),(1,4),(1,3),(1,1),(1,166),(1,167),(9,162),(9,32),(9,33),(9,35),(9,167),(9,164),(9,86),(9,85),(9,84),(9,81),(9,80),(9,79),(9,77),(9,76),(9,75),(9,43),(9,12),(9,11),(9,3),(8,162),(8,32),(8,33),(8,35),(8,167),(8,166),(8,164),(8,163),(8,161),(8,160),(2,46),(2,45),(2,44),(2,40),(2,39),(2,38),(2,37),(2,22),(8,51),(8,50),(8,36),(8,31),(8,30),(8,29),(8,28),(8,27),(8,26),(8,25),(8,24),(8,23),(8,7),(8,159),(8,158),(8,157),(8,156),(8,155),(8,154),(8,153),(8,152),(8,151),(8,150),(8,149),(8,148),(8,147),(8,146),(8,107),(8,106),(8,105),(8,104),(8,103),(8,102),(8,101),(8,100),(8,99),(8,98),(8,97),(8,96),(8,95),(8,94),(8,93),(8,92),(8,91),(8,90),(8,89),(8,88),(8,87),(8,81),(8,79),(8,76),(8,75),(8,58),(8,57),(8,56),(8,55),(8,54),(8,53),(8,52),(2,162),(2,32),(2,33),(2,35),(2,167),(2,166),(2,164),(2,131),(2,130),(2,129),(2,128),(2,127),(2,126),(2,125),(2,124),(2,123),(2,122),(2,121),(2,120),(2,119),(2,118),(2,117),(2,116),(2,115),(2,114),(2,113),(2,112),(2,111),(2,110),(2,109),(2,108),(2,81),(2,77),(2,76),(2,75),(2,74),(2,73),(2,72),(2,71),(2,70),(2,69),(2,68),(2,67),(2,66),(2,65),(2,64),(2,63),(2,62),(2,61),(2,49),(2,48),(2,47),(2,21),(2,20),(2,19),(2,18),(2,17),(2,16),(2,15),(2,14),(2,5),(2,4);

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

insert  into `team_weight`(`teamid`,`inam`,`inevening`,`outam`,`outevening`,`intransitam`,`intransitevening`,`fuelcost`,`tea1`,`tea2`,`tea3`) values ('1',1,1,1,1,NULL,NULL,NULL,'3','','');

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

insert  into `technician_information`(`technicianid`,`technicianname`,`sex`,`isteamleader`,`teamid`,`phone`,`loginphone`,`address`,`borndate`,`wechatnumber`,`idcard`,`residenceaddress`,`residencebank`,`bankaccount`,`levelid`,`maintenancetype`,`maintenancebrand`,`tec1`,`tec2`,`tec3`) values ('1','3','男',1,'1','1','1','1','2021-02-07','1','1','1','1','1','1','1','1','','','');

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

insert  into `technician_level`(`levelid`,`levelname`,`commissionweight`,`leve1`,`leve2`,`leve3`) values ('1','12','1','','',''),('lv1','一星','0.5',NULL,NULL,NULL);

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

insert  into `user`(`user`,`pwd`,`miaoshu`,`u1`,`u2`,`u3`) values ('admin','123','骆华','1','',''),('user','123','林子豪','2',NULL,NULL),('uuff','123','王泽旭','3',NULL,NULL);

/*Table structure for table `user_role` */

DROP TABLE IF EXISTS `user_role`;

CREATE TABLE `user_role` (
  `userid` int(11) DEFAULT NULL,
  `roleid` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `user_role` */

insert  into `user_role`(`userid`,`roleid`) values (2,8),(2,2),(1,2),(1,1),(3,2),(3,8);

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
  `sj` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `w2` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `w3` varchar(100) DEFAULT NULL COMMENT '备用字段',
  PRIMARY KEY (`wid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `weixiubiao` */

insert  into `weixiubiao`(`wid`,`wname`,`shourujizhong`,`xiangmuleibie`,`beizhu`,`bzj`,`hyj`,`vipj`,`xyj`,`spj`,`pxj`,`sj`,`w2`,`w3`) values (10001,'检查后钢板吊耳及座子','工时费','大众','1',1,1,1,1,1,1,'车型',NULL,NULL),(10002,'645645','工时费','1号发动机','1',1,0.8,0.9,0.5,0.5,0.5,'发动机','',''),(123123,'21312','工时费','中国重汽','1312',90,85.5,81,108,117,45,'车型','',''),(10004,'官方大哥大哥','工时费','奔驰','646456',50,100,25,100,100,100,'车型','',''),(6546,'456','其他费','4号发动机','46456',1000000000,950000000,500000000,1200000000,1300000000,1400000000,'发动机','',''),(777,'77','工时费','3号发动机','77',100,200,200,200,200,200,'发动机',NULL,NULL),(188,'11','工时费','奔驰','11',100,200,200,200,200,200,'车型',NULL,NULL),(6654,'456','工时费','1号发动机','456',100,95,90,120,130,140,'发动机',NULL,NULL),(123124,'121','燃油费','大众','12',100000000,95000000,90000000,120000000,130000000,140000000,'车型',NULL,NULL),(10007,'11','工时费','大众','444',100,95,90,120,130,140,'车型',NULL,NULL),(6456,'456','燃油费','中度','456',1000000000,950000000,900000000,1200000000,1300000000,1400000000,'喷板',NULL,NULL);

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

insert  into `xuelibiao`(`educationid`,`name`,`ed1`,`ed2`,`ed3`) values (1,'本科',NULL,NULL,NULL),(2,'博士',NULL,NULL,NULL),(3,'大专',NULL,NULL,NULL),(4,'硕士',NULL,NULL,NULL);

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

insert  into `xueweibiao`(`collegeid`,`name`,`co1`,`co2`,`co3`) values (1,'博士',NULL,NULL,NULL),(2,'硕士',NULL,NULL,NULL);

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

insert  into `ycfc`(`ycfcid`,`ycfc`,`yc1`,`yc2`,`yc3`) values (1,'一号厂',NULL,NULL,NULL),(2,'二号厂',NULL,NULL,NULL),(3,'三号厂',NULL,NULL,NULL);

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
  `reserved3` int(100) DEFAULT NULL,
  `reserved5` int(100) DEFAULT NULL,
  `reserved1` varchar(100) DEFAULT NULL,
  `reserved2` varchar(100) DEFAULT NULL,
  `reserved4` varchar(100) DEFAULT NULL,
  `reserved9` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`yid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `yuangongziliaobiao` */

insert  into `yuangongziliaobiao`(`yid`,`yname`,`ysex`,`yposition`,`yhealth`,`yloginemp`,`yheigth`,`ynativplaceid`,`ynationid`,`yschoolid`,`yspecialtyid`,`yspecialtynid`,`yattribute`,`ycollegeid`,`yorganizationid`,`ynumber`,`yaddressh`,`yaddressx`,`yphonenumber`,`yphone`,`email`,`ybankid`,`ybankphone`,`yjname`,`yjphone`,`ystarttime`,`yendtime`,`ydatetime`,`ystarttimeh`,`yendtimeh`,`ytname`,`yratez`,`yrateg`,`yrates`,`yratej`,`ygong`,`yjiao`,`yhome`,`yjiang`,`yping`,`gid`,`bid`,`zhaopian`,`y1`,`y2`,`y3`,`reserved3`,`reserved5`,`reserved1`,`reserved2`,`reserved4`,`reserved9`) values (2,'王子来','男','实习员工','亚健康','123','1.8',1,1,1,1,1,'记考勤不计薪',1,1,'430223200107081811','株洲本地','北京','17773397121','17773391721','1971604071@qq.com',1,'24471577','易杨凯','17773397122','2001-5-5','2015-5-8','1985-5-5','2001-5-8','2004-5-5','易杨凯',1,1,1,1,'完美','完美','父母','无','无',7,5,'无','2','2021-8-9','钱太少',6,5,'123','11','管理部','二部'),(3,'史珍香','女','实习员工','亚健康','123','1.8',1,1,1,1,1,'记考勤不计薪',1,1,'430223200107081811','株洲本地','北京','17773397121','17773391721','1971604071@qq.com',1,'24471577','易杨凯','17773397122','2001-5-5','2015-5-8','1985-5-5','2001-5-8','2004-5-5','易杨凯',1,1,1,1,'完美','完美','父母','无','无',7,5,'无','1',NULL,NULL,6,6,'123','11','管理部','一部'),(4,'王泽旭','男','实习员工','亚健康','123','1.8',1,1,1,1,1,'记考勤不计薪',1,1,'430223200107081811','株洲本地','北京','17773397121','17773391721','1971604071@qq.com',1,'24471577','易杨凯','17773397122','2001-5-5','2015-5-8','1985-5-5','2001-5-8','2004-5-5','易杨凯',1,1,1,1,'完美','完美','父母','无','无',7,5,'无','2','2019-8-9','前景不好',6,5,'123','11','管理部','二部'),(1,'林子豪','男','实习员工','健康','123','1.8',1,1,1,1,1,'记考勤不计薪',1,1,'430223200107081811','株洲攸县','北京','17773397121','17773391721','1971604071@qq.com',1,'24471577','易杨凯','17773397122','2001-5-5','2015-5-8','1985-5-5','2001-5-8','2004-5-5','易杨凯',1,1,1,1,'完美','完美','父母','无','无',7,4,'无','1',NULL,NULL,6,4,'123','11','管理部','一部'),(5,'张毅丰','女','实习员工','亚健康','123','1.8',1,1,1,1,1,'记考勤不计薪',1,1,'430223200107081811','株洲本地','北京','17773397121','17773391721','1971604071@qq.com',1,'24471577','易杨凯','17773397122','2001-5-5','2015-5-8','1985-5-5','2001-5-8','2004-5-5','易杨凯',1,1,1,1,'完美','完美','父母','无','无',7,5,'无','1',NULL,NULL,7,7,'123','11','管理部','一部'),(6,'贺乐天','男','实习员工','健康','123','1.8',1,1,1,1,1,'记考勤不计薪',1,1,'430223200107081811','株洲攸县','北京','17773397121','17773391721','1971604071@qq.com',1,'24471577','易杨凯','17773397122','2001-5-5','2015-5-8','1985-5-5','2001-5-8','2004-5-5','易杨凯',1,1,1,1,'完美','完美','父母','无','无',7,4,'无','2','2016-8-9','能力不够',7,4,'123','11','维修部','一部'),(7,'朱灿','男','实习员工','亚健康','123','1.8',1,1,1,1,1,'记考勤不计薪',1,1,'430223200107081811','株洲本地','北京','17773397121','17773391721','1971604071@qq.com',1,'24471577','易杨凯','17773397122','2001-5-5','2015-5-8','1985-5-5','2001-5-8','2004-5-5','易杨凯',1,1,1,1,'完美','完美','父母','无','无',7,6,'无','1',NULL,NULL,7,5,'123','11','维修部','二部'),(8,'骆华','女','实习员工','亚健康','123','1.8',1,1,1,1,1,'记考勤不计薪',1,1,'430223200107081811','株洲本地','北京','17773397121','17773391721','1971604071@qq.com',1,'24471577','易杨凯','17773397122','2001-5-5','2015-5-8','1985-5-5','2001-5-8','2004-5-5','易杨凯',1,1,1,1,'完美','完美','父母','无','无',7,7,'无','2','2017-8-9','没钱吃饭',7,6,'123','11','维修部','一部'),(9,'李艺星','男','实习员工','亚健康','123','1.8',1,1,1,1,1,'记考勤不计薪',1,1,'430223200107081811','株洲本地','北京','17773397121','17773391721','1971604071@qq.com',1,'24471577','易杨凯','17773397122','2001-5-5','2015-5-8','1985-5-5','2001-5-8','2004-5-5','易杨凯',1,1,1,1,'完美','完美','父母','无','无',7,8,'无','1',NULL,NULL,7,5,'123','11','维修部','二部'),(10,'马威','女','实习员工','亚健康','123','1.8',1,1,1,1,1,'记考勤不计薪',1,1,'430223200107081811','株洲本地','北京','17773397121','17773391721','1971604071@qq.com',1,'24471577','易杨凯','17773397122','2001-5-5','2015-5-8','1985-5-5','2001-5-8','2004-5-5','易杨凯',1,1,1,1,'完美','完美','父母','无','无',7,9,'无','2','2016-8-8','家里有矿',7,7,'123','11','维修部','一部');

/*Table structure for table `zhekoubiao` */

DROP TABLE IF EXISTS `zhekoubiao`;

CREATE TABLE `zhekoubiao` (
  `zid` int(11) NOT NULL AUTO_INCREMENT,
  `zname` varchar(20) NOT NULL,
  `zhe` float NOT NULL,
  `z1` varchar(50) DEFAULT NULL,
  `z2` varchar(50) DEFAULT NULL,
  `z3` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`zid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `zhekoubiao` */

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

insert  into `zhuanyezigebiao`(`specialtynid`,`name`,`spe1`,`spe2`,`spe3`) values (1,'初级工程师',NULL,NULL,NULL),(2,'中级工程师',NULL,NULL,NULL),(3,'高级工程师',NULL,NULL,NULL);

/*Table structure for table `ziduan` */

DROP TABLE IF EXISTS `ziduan`;

CREATE TABLE `ziduan` (
  `id` int(11) DEFAULT NULL,
  `width` varchar(300) DEFAULT NULL,
  `dname` varchar(300) DEFAULT NULL,
  `zname` varchar(300) DEFAULT NULL,
  `display` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `ziduan` */

insert  into `ziduan`(`id`,`width`,`dname`,`zname`,`display`) values (1,'100','客户编码','a1',1),(2,'100','客户名称','a1',1),(3,'100','详细地址','a1',1),(4,'100','联系人','a1',1),(5,'100','手机','a1',1),(6,'100','客户生日','a1',1),(7,'100','客户类别','a1',1),(8,'100','会员卡号','a1',1),(9,'100','入会日期','a1',1),(10,'100','会员到期','a1',1),(11,'100','备注','a1',1),(12,'100','建档日期','a1',1),(13,'100','服务顾问','a1',1),(14,'100','业务员电话','a1',1),(15,'100','账期(天)','a1',1),(16,'100','挂账额度','a1',1),(17,'100','累计积分','a1',1),(18,'100','订金金额','a1',1),(19,'100','客户省','a1',1),(20,'100','客户市','a1',1),(21,'100','客户区','a1',1),(22,'100','纳税人识别号','a1',1),(23,'100','注册电话','a1',1),(24,'100','开户银行','a1',1),(25,'100','银行账号','a1',1),(26,'100','注册地址','a1',1),(27,'100','其它一','a1',1),(28,'100','其它二','a1',1),(29,'100','其它三','a1',1),(30,'100','其它四','a1',1);

/*Table structure for table `ziduana` */

DROP TABLE IF EXISTS `ziduana`;

CREATE TABLE `ziduana` (
  `id` int(11) DEFAULT NULL,
  `width` varchar(300) DEFAULT NULL,
  `dname` varchar(300) DEFAULT NULL,
  `zname` varchar(300) DEFAULT NULL,
  `display` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `ziduana` */

insert  into `ziduana`(`id`,`width`,`dname`,`zname`,`display`) values (1,'100','车牌号码','a1',1),(2,'100','车辆品牌','a1',1),(3,'100','车辆型号','a1',1),(4,'100','驾驶员','a1',1),(5,'100','驾驶员电话','a1',1),(6,'100','出生日期','a1',1),(7,'100','车辆归属','a1',1),(8,'100','驾证到期','a1',1),(9,'100','车架号','a1',1),(10,'100','发动机号','a1',1),(11,'100','发动机品牌号','a1',1),(12,'100','车辆年款','a1',1),(13,'100','里程','a1',1),(14,'100','载重','a1',1),(15,'100','车系','a1',1),(16,'100','购买日期','a1',1),(17,'100','上牌日期','a1',1),(18,'100','车检到期','a1',1),(19,'100','交强险保险公司','a1',1),(20,'100','交强险到期','a1',1),(21,'100','商业险保险公司','a1',1),(22,'100','商业险到期','a1',1),(23,'100','在我投保投车','a1',1),(24,'100','二维日期','a1',1),(25,'100','燃油类别','a1',1),(26,'100','下次保养里程','a1',1),(27,'100','下次保养日期','a1',1),(28,'100','会员码','a1',1);

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

insert  into `zuzhijiegoubiao`(`zid`,`zname`,`msname`,`mshou`,`mdianid`,`mzuishu`,`mtiao`,`mcityid`,`mkai`,`maddress`,`mshui`,`mphone`,`mlname`,`mhang`,`mzhang`,`mgouid`,`mru`,`mting`,`zids`,`zyid`,`z1`,`z2`,`z3`) values (1,'株洲市汽修','a','100',1,'10000','20',5,'毛主席','北京天安门','1433223','13117334216','九某','1','iogei',1,'没开','否',0,1,'1','1','1'),(2,'总厂','b','100',1,'10000','20',5,'毛主席','北京天安门','1433223','13117334216','九某','1','iogei',1,'没开','否',1,1,'1','1','1'),(3,'副厂','c',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,1,NULL,'1',NULL,NULL),(4,'机电组','d',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,2,NULL,'1',NULL,NULL),(123,'维修组','1',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,1,NULL,NULL,3,NULL,NULL,NULL,NULL),(6,'人事部','f',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,2,NULL,'1',NULL,NULL),(7,'市场部','d',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,3,NULL,'1',NULL,NULL);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
