-- --------------------------------------------------------
-- 主机:                           127.0.0.1
-- 服务器版本:                        5.7.25 - MySQL Community Server (GPL)
-- 服务器操作系统:                      Win64
-- HeidiSQL 版本:                  9.3.0.4984
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- 导出 teaimsdb 的数据库结构
CREATE DATABASE IF NOT EXISTS `teaimsdb` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `teaimsdb`;


-- 导出  表 teaimsdb.t_college 结构
CREATE TABLE IF NOT EXISTS `t_college` (
  `college_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '学院id',
  `college_name` varchar(20) NOT NULL COMMENT '学院名称',
  PRIMARY KEY (`college_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='学院表';

-- 正在导出表  teaimsdb.t_college 的数据：~5 rows (大约)
DELETE FROM `t_college`;
/*!40000 ALTER TABLE `t_college` DISABLE KEYS */;
INSERT INTO `t_college` (`college_id`, `college_name`) VALUES
	(1, '马列学院'),
	(2, '信息工程学院'),
	(3, '经济与管理学院'),
	(4, '材料与冶金学院'),
	(5, '医学院'),
	(6, '数学与计算科学学院');
/*!40000 ALTER TABLE `t_college` ENABLE KEYS */;


-- 导出  表 teaimsdb.t_course 结构
CREATE TABLE IF NOT EXISTS `t_course` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id编号',
  `course_no` varchar(20) NOT NULL COMMENT '课程编号',
  `course_name` varchar(50) NOT NULL COMMENT '课程名称',
  `course_type` varchar(20) NOT NULL COMMENT '课程类型',
  `week_class_hour` int(11) NOT NULL COMMENT '周学时',
  `teach_class_hour` int(11) NOT NULL COMMENT '教授学时',
  `experiment_class_hour` int(11) NOT NULL COMMENT '实验学时',
  `computer_class_hour` int(11) NOT NULL COMMENT '上机学时',
  `other_class_hour` int(11) NOT NULL COMMENT '其他学时',
  `sumup_class_hour` int(11) NOT NULL COMMENT '总学时',
  `credit` double NOT NULL COMMENT '学分数',
  `state` bit(1) DEFAULT NULL COMMENT '课程开设状态',
  `remark` varchar(100) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8 COMMENT='课程信息表';

-- 正在导出表  teaimsdb.t_course 的数据：~5 rows (大约)
DELETE FROM `t_course`;
/*!40000 ALTER TABLE `t_course` DISABLE KEYS */;
INSERT INTO `t_course` (`id`, `course_no`, `course_name`, `course_type`, `week_class_hour`, `teach_class_hour`, `experiment_class_hour`, `computer_class_hour`, `other_class_hour`, `sumup_class_hour`, `credit`, `state`, `remark`) VALUES
	(1, 'A038434893', '大学计算机基础', '必修课', 1, 0, 0, 30, 0, 30, 2, b'1', '大学计算机基础'),
	(2, 'A034839444', 'C语言程序设计', '必修课', 2, 0, 0, 30, 0, 30, 2, b'1', 'C语言程序设计'),
	(4, 'A039123942', '离散数学', '必修课', 2, 60, 0, 0, 0, 60, 4, b'1', '离散数学'),
	(14, 'A034839459', '高等数学', '必修课', 2, 90, 0, 0, 0, 90, 4, b'1', 'xxx');
/*!40000 ALTER TABLE `t_course` ENABLE KEYS */;


-- 导出  表 teaimsdb.t_dept 结构
CREATE TABLE IF NOT EXISTS `t_dept` (
  `dept_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '系部id',
  `dept_name` varchar(20) NOT NULL COMMENT '系部名称',
  PRIMARY KEY (`dept_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='系部表';

-- 正在导出表  teaimsdb.t_dept 的数据：~5 rows (大约)
DELETE FROM `t_dept`;
/*!40000 ALTER TABLE `t_dept` DISABLE KEYS */;
INSERT INTO `t_dept` (`dept_id`, `dept_name`) VALUES
	(1, '人文系'),
	(2, '计算机系'),
	(3, '金融系'),
	(4, '冶金系'),
	(5, '临床医学系'),
	(6, '数学系');
/*!40000 ALTER TABLE `t_dept` ENABLE KEYS */;


-- 导出  表 teaimsdb.t_dict 结构
CREATE TABLE IF NOT EXISTS `t_dict` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `field` varchar(20) NOT NULL COMMENT '数据字段',
  `val` varchar(20) DEFAULT NULL COMMENT '数据存储值',
  `dict_desc` varchar(50) NOT NULL COMMENT '数据值描述',
  `parent_id` int(11) NOT NULL COMMENT '父字典id',
  `is_valid` bit(1) NOT NULL COMMENT '是否有效',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='数据字典表';

-- 正在导出表  teaimsdb.t_dict 的数据：~4 rows (大约)
DELETE FROM `t_dict`;
/*!40000 ALTER TABLE `t_dict` DISABLE KEYS */;
INSERT INTO `t_dict` (`id`, `field`, `val`, `dict_desc`, `parent_id`, `is_valid`, `create_time`, `update_time`) VALUES
	(1, 'sex', NULL, '性别', 0, b'1', '2021-03-04 21:13:55', '2021-03-04 21:13:55'),
	(2, 'sex', '0', '女', 1, b'1', '2021-03-04 21:13:55', '2021-03-04 21:13:55'),
	(3, 'sex', '1', '男', 1, b'1', '2021-03-04 21:13:55', '2021-03-04 21:13:55');
/*!40000 ALTER TABLE `t_dict` ENABLE KEYS */;


-- 导出  表 teaimsdb.t_honor 结构
CREATE TABLE IF NOT EXISTS `t_honor` (
  `hid` int(10) NOT NULL AUTO_INCREMENT COMMENT '荣誉id',
  `hno` varchar(50) NOT NULL COMMENT '荣誉编号',
  `tid` int(10) NOT NULL COMMENT '第一完成人(教师姓名)',
  `hname` varchar(50) NOT NULL COMMENT '荣誉名称',
  `participants` varchar(200) DEFAULT NULL COMMENT '参与人',
  `hdate` date NOT NULL COMMENT '获奖时间',
  `hcompany` varchar(50) NOT NULL COMMENT '颁奖单位',
  `hdepartment` varchar(50) NOT NULL COMMENT '授予单位',
  `hgrade` varchar(10) NOT NULL COMMENT '获奖级别(市级、省级、国家级)',
  `hlevel` varchar(10) NOT NULL COMMENT '获奖等级(一等、二等、三等)',
  `htype` varchar(20) NOT NULL COMMENT '获奖类别',
  `kytype` varchar(20) NOT NULL COMMENT '科研类别',
  `haccessory_url` varchar(100) DEFAULT NULL COMMENT '附件url地址',
  `haudit` bit(1) DEFAULT NULL COMMENT '审核状态(1审核通过 0审核未通过)',
  `message` varchar(200) DEFAULT NULL COMMENT '审核意见',
  `remark` varchar(300) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`hid`),
  KEY `tid` (`tid`),
  KEY `hname_index` (`hname`),
  KEY `kytype_index` (`kytype`),
  CONSTRAINT `t_honor_ibfk_1` FOREIGN KEY (`tid`) REFERENCES `t_teacher` (`tid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='获奖荣誉表';

-- 正在导出表  teaimsdb.t_honor 的数据：~2 rows (大约)
DELETE FROM `t_honor`;
/*!40000 ALTER TABLE `t_honor` DISABLE KEYS */;
INSERT INTO `t_honor` (`hid`, `hno`, `tid`, `hname`, `participants`, `hdate`, `hcompany`, `hdepartment`, `hgrade`, `hlevel`, `htype`, `kytype`, `haccessory_url`, `haudit`, `message`, `remark`) VALUES
	(1, 'PJZ-2013-10', 10, '江苏省人工智能挑战赛团体二等奖', '刘洋，沈斌', '2013-10-18', '江苏省教育厅', '南京大学', '省级', '二等奖', '竞赛', '无', '', b'1', 'dfgggdd', NULL),
	(2, 'PJZ-2013-11', 10, '江苏省网络安全大赛团体二等奖', '胡广杨，刘利君，许芳', '2013-11-13', '江苏省教育厅', '南京大学', '省级', '二等奖', '竞赛', '无', '', b'1', 'dfgefefefessd', NULL);
/*!40000 ALTER TABLE `t_honor` ENABLE KEYS */;


-- 导出  表 teaimsdb.t_module 结构
CREATE TABLE IF NOT EXISTS `t_module` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `module_name` varchar(20) NOT NULL COMMENT '模块名称',
  `url` varchar(100) DEFAULT NULL COMMENT '模块url地址',
  `parent_id` int(10) NOT NULL COMMENT '父模块id',
  `parent_opt_value` varchar(255) DEFAULT NULL COMMENT '父模块权限值',
  `opt_value` varchar(255) NOT NULL COMMENT '权限值',
  `grade` int(11) NOT NULL COMMENT '等级',
  `module_state` bit(1) DEFAULT NULL COMMENT '模块状态',
  `create_time` date DEFAULT NULL COMMENT '创建时间',
  `update_time` date DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=51 DEFAULT CHARSET=utf8 COMMENT='模块功能表';

-- 正在导出表  teaimsdb.t_module 的数据：~47 rows (大约)
DELETE FROM `t_module`;
/*!40000 ALTER TABLE `t_module` DISABLE KEYS */;
INSERT INTO `t_module` (`id`, `module_name`, `url`, `parent_id`, `parent_opt_value`, `opt_value`, `grade`, `module_state`, `create_time`, `update_time`) VALUES
	(1, '基本资料', 'user/toTeacherInfoPage', 0, '00', '1010', 0, b'1', '2021-02-17', '2021-02-17'),
	(2, '修改密码', 'user/toPasswordPage', 0, '00', '1020', 0, b'1', '2021-02-17', '2021-02-17'),
	(3, '退出登录', 'user/logout', 0, '00', '1030', 0, b'1', '2021-02-17', '2021-02-17'),
	(4, '教师信息管理', '#', 0, '00', '2000', 0, b'1', '2021-02-17', '2021-02-17'),
	(6, '教师基本信息管理', 'tea/teaInfo', 4, '2000', '2010', 1, b'1', '2021-02-17', '2021-02-17'),
	(7, '审核管理', '#', 0, '00', '3000', 0, b'1', '2021-02-17', '2021-02-17'),
	(8, '科研项目审核管理', 'project/auditProjectListPage', 7, '3000', '3010', 1, b'1', '2021-02-17', '2021-02-17'),
	(9, '论文审核管理', 'paper/auditPaperListPage', 7, '3000', '3020', 1, b'1', '2021-02-17', '2021-02-17'),
	(10, '研究课题审核管理', 'search/auditResearchListPage', 7, '3000', '3030', 1, b'1', '2021-02-17', '2021-02-17'),
	(11, '专利审核管理', 'patent/auditPatentListPage', 7, '3000', '3040', 1, b'1', '2021-02-17', '2021-02-17'),
	(12, '获奖审核管理', 'honor/auditHonorListPage', 7, '3000', '3050', 1, b'1', '2021-02-17', '2021-02-17'),
	(13, '项目管理', '#', 0, '00', '4000', 0, b'1', '2021-02-17', '2021-02-17'),
	(14, '论文管理', '#', 0, '00', '5000', 0, b'1', '2021-02-17', '2021-02-17'),
	(15, '课题研究管理', '#', 0, '00', '6000', 0, b'1', '2021-02-17', '2021-02-17'),
	(16, '专利管理', '#', 0, '00', '7000', 0, b'1', '2021-02-17', '2021-02-17'),
	(17, '获奖管理', '#', 0, '00', '8000', 0, b'1', '2021-02-17', '2021-02-17'),
	(18, '项目申请', 'project/apply', 13, '4000', '4010', 1, b'1', '2021-02-17', '2021-02-17'),
	(19, '项目列表', 'project/list', 13, '4000', '4020', 1, b'1', '2021-02-17', '2021-02-17'),
	(20, '论文申报', 'paper/apply', 14, '5000', '5010', 1, b'1', '2021-02-17', '2021-02-17'),
	(21, '论文列表', 'paper/list', 14, '5000', '5020', 1, b'1', '2021-02-17', '2021-02-17'),
	(22, '专利申请', 'patent/apply', 15, '6000', '6010', 1, b'1', '2021-02-17', '2021-02-17'),
	(23, '专利列表', 'patent/list', 15, '6000', '6020', 1, b'1', '2021-02-17', '2021-02-17'),
	(24, '荣誉申报', 'honor/apply', 16, '7000', '7010', 1, b'1', '2021-02-17', '2021-02-17'),
	(25, '荣誉列表', 'honor/list', 16, '7000', '7020', 1, b'1', '2021-02-17', '2021-02-17'),
	(26, '研究课题申报', 'search/apply', 17, '8000', '8010', 1, b'1', '2021-02-17', '2021-02-17'),
	(27, '研究课题列表', 'search/list', 17, '8000', '8020', 1, b'1', '2021-02-17', '2021-02-17'),
	(28, '系统管理', '#', 0, '00', '9000', 0, b'1', '2021-02-17', '2021-02-17'),
	(29, '用户管理', 'user/listPage', 28, '9000', '9010', 1, b'1', '2021-02-17', '2021-02-17'),
	(30, '角色管理', 'role/listPage', 28, '9000', '9020', 1, b'1', '2021-02-17', '2021-02-17'),
	(31, '菜单管理', 'module/listPage', 28, '9000', '9030', 1, b'1', '2021-02-17', '2021-02-17'),
	(32, '数据字典管理', 'dict/listPage', 28, '9000', '9040', 1, b'1', '2021-02-18', '2021-02-18'),
	(33, '综合查询', 'query/all', 0, '00', '10000', 0, b'1', '2021-02-18', '2021-02-18'),
	(35, '课时管理', NULL, 0, NULL, '11000', 0, b'1', '2021-03-13', '2021-03-13'),
	(36, '课时申请', 'classHour/apply', 35, NULL, '11010', 1, b'1', '2021-03-13', '2021-03-13'),
	(37, '课时统计', 'classHour/summary', 35, NULL, '11020', 1, b'1', '2021-03-13', '2021-03-13'),
	(38, '课时查询', 'classHour/query', 35, NULL, '11030', 1, b'1', '2021-03-13', '2021-03-13'),
	(39, '课时审核列表', 'classHour/auditList', 35, NULL, '11040', 1, b'1', '2021-03-13', '2021-03-13'),
	(40, '课程管理', NULL, 0, NULL, '12000', 0, b'1', '2021-03-13', '2021-03-13'),
	(41, '课程查询', 'course/query', 40, NULL, '12010', 1, b'1', '2021-03-13', '2021-03-13'),
	(42, '课程列表', 'course/list', 40, NULL, '12020', 1, b'1', '2021-03-13', '2021-03-13'),
	(43, '授课管理', NULL, 0, NULL, '13000', 0, b'1', '2021-03-13', '2021-03-13'),
	(44, '授课分配(排课)', 'teach/assign', 43, NULL, '13010', 1, b'1', '2021-03-13', '2021-03-13'),
	(45, '授课申请', 'teach/apply', 43, NULL, '13020', 1, b'1', '2021-03-13', '2021-03-13'),
	(46, '授课查询', 'teach/query', 43, NULL, '13030', 1, b'1', '2021-03-13', '2021-03-13'),
	(47, '授课审核', 'teach/auditList', 43, NULL, '13040', 1, b'1', '2021-03-13', '2021-03-13'),
	(48, '课表管理', NULL, 0, NULL, '14000', 0, b'1', '2021-03-13', '2021-03-13'),
	(49, '课表查询', 'schedule/query', 48, NULL, '14010', 1, b'1', '2021-03-13', '2021-03-13'),
	(50, '我的课表', 'schedule/query', 48, NULL, '14020', 1, b'1', '2021-03-28', '2021-03-28');
/*!40000 ALTER TABLE `t_module` ENABLE KEYS */;


-- 导出  表 teaimsdb.t_paper 结构
CREATE TABLE IF NOT EXISTS `t_paper` (
  `paid` int(10) NOT NULL AUTO_INCREMENT COMMENT '论文id',
  `pano` varchar(30) NOT NULL COMMENT '论文编号',
  `paname` varchar(100) NOT NULL COMMENT '论文名称',
  `tid` int(10) NOT NULL COMMENT '发表人id',
  `pagrade` varchar(10) NOT NULL COMMENT '论文等级',
  `papublish` varchar(20) NOT NULL COMMENT '发表期刊',
  `padate` date NOT NULL COMMENT '发表时间',
  `pakind` varchar(10) NOT NULL COMMENT '论文类型',
  `subject` varchar(50) NOT NULL COMMENT '论文研究范畴',
  `content` varchar(100) NOT NULL COMMENT '主要研究内容',
  `letternum` int(11) NOT NULL COMMENT '论文字数',
  `pub_year` int(11) NOT NULL COMMENT '发表年份',
  `pub_volume` int(11) NOT NULL COMMENT '发表卷数',
  `pub_stage` int(11) NOT NULL COMMENT '发表期数',
  `dependency` varchar(20) DEFAULT NULL COMMENT '依赖项目',
  `paccesssory` varchar(200) DEFAULT NULL COMMENT '附件url地址',
  `paudit` bit(1) DEFAULT NULL COMMENT '审核状态(0审核不通过 1审核通过)',
  `message` varchar(200) DEFAULT NULL COMMENT '审核意见',
  `paremark` varchar(300) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`paid`),
  KEY `tid` (`tid`),
  CONSTRAINT `t_paper_ibfk_1` FOREIGN KEY (`tid`) REFERENCES `t_teacher` (`tid`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='论文表';

-- 正在导出表  teaimsdb.t_paper 的数据：~4 rows (大约)
DELETE FROM `t_paper`;
/*!40000 ALTER TABLE `t_paper` DISABLE KEYS */;
INSERT INTO `t_paper` (`paid`, `pano`, `paname`, `tid`, `pagrade`, `papublish`, `padate`, `pakind`, `subject`, `content`, `letternum`, `pub_year`, `pub_volume`, `pub_stage`, `dependency`, `paccesssory`, `paudit`, `message`, `paremark`) VALUES
	(1, 'GB/T 2010-09-778', '大数据时代下软件工程关键技术分析', 10, 'A类', '中文核心期刊', '2010-06-10', '科技论文', '大数据软件工程', '大数据软件工程关键技术', 20000, 2010, 16, 23, '无', NULL, b'1', 'ok', 'xxxxxxxxxxxxxxxxxxxaa'),
	(2, 'GB/T 2013-05-275', 'Hiring and Intra-occupational Gender Segregation in Software Engineering', 17, 'A类', 'SCI', '2013-05-17', '科技论文', 'Software Engineering', 'Software Engineering', 30000, 2013, 14, 26, '无', NULL, b'0', '审核未通过，请重新提交', 'xxxxxxxxxxxxxxxxxxxxxxxxx'),
	(3, 'GB/T 2015-11-372', '网络型病毒与计算机网络安全探讨', 18, 'B类', '中国科技论文统计源期刊', '2015-11-15', '科技论文', '计算机网络安全', '网络型病毒与计算机网络安全', 20000, 2015, 35, 27, '无', NULL, b'1', 'non-ok', 'xxxxxxxxxxxxxxxxxxx'),
	(4, 'GB/T 2009-09-778', '大数据环境下的网络安全分析', 10, 'A类', '中文核心期刊', '2009-09-17', '科技论文', '计算机网络安全', '大数据环境下的网络安全分析', 15000, 2009, 26, 22, 'xxxxxxxxxxx', NULL, b'1', 'xxxxxxxxxxxxxx', 'xxxxxxxxxxxxxxxxxxxx');
/*!40000 ALTER TABLE `t_paper` ENABLE KEYS */;


-- 导出  表 teaimsdb.t_patent 结构
CREATE TABLE IF NOT EXISTS `t_patent` (
  `patid` int(10) NOT NULL AUTO_INCREMENT COMMENT '专利id',
  `patno` varchar(30) NOT NULL COMMENT '专利编号',
  `patname` varchar(30) NOT NULL COMMENT '专利名称',
  `tid` int(10) NOT NULL COMMENT '发明人id',
  `participants` varchar(100) DEFAULT NULL COMMENT '参与人',
  `patsn` varchar(50) NOT NULL COMMENT '授权编号',
  `patappdate` date NOT NULL COMMENT '申请时间',
  `patendate` date NOT NULL COMMENT '授权时间',
  `patgrade` varchar(10) NOT NULL COMMENT '专利等级',
  `pattype` varchar(20) NOT NULL COMMENT '专利类型',
  `paccessory` varchar(200) DEFAULT NULL COMMENT '专利附件url地址',
  `paudit` bit(1) DEFAULT NULL COMMENT '审核状态',
  `message` varchar(200) DEFAULT NULL COMMENT '审核意见',
  `remark` varchar(300) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`patid`),
  KEY `tid` (`tid`),
  CONSTRAINT `t_patent_ibfk_1` FOREIGN KEY (`tid`) REFERENCES `t_teacher` (`tid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='专利表';

-- 正在导出表  teaimsdb.t_patent 的数据：~0 rows (大约)
DELETE FROM `t_patent`;
/*!40000 ALTER TABLE `t_patent` DISABLE KEYS */;
INSERT INTO `t_patent` (`patid`, `patno`, `patname`, `tid`, `participants`, `patsn`, `patappdate`, `patendate`, `patgrade`, `pattype`, `paccessory`, `paudit`, `message`, `remark`) VALUES
	(1, 'ZL95115608.X', '多层次金属花纹的制造方法', 19, '尹静，刘飞，萧河', 'ZL95115608.X', '1995-06-23', '1995-06-23', '国家级', '发明专利', '', b'1', 'xxxxxx', NULL);
/*!40000 ALTER TABLE `t_patent` ENABLE KEYS */;


-- 导出  表 teaimsdb.t_permission 结构
CREATE TABLE IF NOT EXISTS `t_permission` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT 'id号',
  `role_id` int(10) NOT NULL COMMENT '角色id',
  `module_id` int(10) NOT NULL COMMENT '模块id',
  `acl_value` varchar(255) NOT NULL COMMENT '权限码',
  `create_time` date DEFAULT NULL COMMENT '创建时间',
  `update_time` date DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`),
  KEY `role_id` (`role_id`),
  KEY `module_id` (`module_id`),
  CONSTRAINT `t_permission_ibfk_1` FOREIGN KEY (`role_id`) REFERENCES `t_role` (`rid`),
  CONSTRAINT `t_permission_ibfk_2` FOREIGN KEY (`module_id`) REFERENCES `t_module` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1213 DEFAULT CHARSET=utf8 COMMENT='权限信息表';

-- 正在导出表  teaimsdb.t_permission 的数据：~55 rows (大约)
DELETE FROM `t_permission`;
/*!40000 ALTER TABLE `t_permission` DISABLE KEYS */;
INSERT INTO `t_permission` (`id`, `role_id`, `module_id`, `acl_value`, `create_time`, `update_time`) VALUES
	(1043, 7, 1, '1010', '2021-03-13', '2021-03-13'),
	(1044, 7, 2, '1020', '2021-03-13', '2021-03-13'),
	(1045, 7, 3, '1030', '2021-03-13', '2021-03-13'),
	(1046, 7, 4, '2000', '2021-03-13', '2021-03-13'),
	(1047, 7, 6, '2010', '2021-03-13', '2021-03-13'),
	(1048, 7, 7, '3000', '2021-03-13', '2021-03-13'),
	(1049, 7, 8, '3010', '2021-03-13', '2021-03-13'),
	(1050, 7, 9, '3020', '2021-03-13', '2021-03-13'),
	(1051, 7, 10, '3030', '2021-03-13', '2021-03-13'),
	(1052, 7, 11, '3040', '2021-03-13', '2021-03-13'),
	(1053, 7, 12, '3050', '2021-03-13', '2021-03-13'),
	(1054, 7, 28, '9000', '2021-03-13', '2021-03-13'),
	(1055, 7, 29, '9010', '2021-03-13', '2021-03-13'),
	(1056, 7, 30, '9020', '2021-03-13', '2021-03-13'),
	(1057, 7, 31, '9030', '2021-03-13', '2021-03-13'),
	(1058, 7, 32, '9040', '2021-03-13', '2021-03-13'),
	(1059, 7, 33, '10000', '2021-03-13', '2021-03-13'),
	(1060, 7, 35, '11000', '2021-03-13', '2021-03-13'),
	(1061, 7, 37, '11020', '2021-03-13', '2021-03-13'),
	(1062, 7, 39, '11040', '2021-03-13', '2021-03-13'),
	(1063, 7, 40, '12000', '2021-03-13', '2021-03-13'),
	(1064, 7, 42, '12020', '2021-03-13', '2021-03-13'),
	(1065, 7, 43, '13000', '2021-03-13', '2021-03-13'),
	(1066, 7, 44, '13010', '2021-03-13', '2021-03-13'),
	(1067, 7, 47, '13040', '2021-03-13', '2021-03-13'),
	(1068, 7, 48, '14000', '2021-03-13', '2021-03-13'),
	(1069, 7, 49, '14010', '2021-03-13', '2021-03-13'),
	(1185, 2, 1, '1010', '2021-03-28', '2021-03-28'),
	(1186, 2, 2, '1020', '2021-03-28', '2021-03-28'),
	(1187, 2, 3, '1030', '2021-03-28', '2021-03-28'),
	(1188, 2, 13, '4000', '2021-03-28', '2021-03-28'),
	(1189, 2, 18, '4010', '2021-03-28', '2021-03-28'),
	(1190, 2, 19, '4020', '2021-03-28', '2021-03-28'),
	(1191, 2, 14, '5000', '2021-03-28', '2021-03-28'),
	(1192, 2, 20, '5010', '2021-03-28', '2021-03-28'),
	(1193, 2, 21, '5020', '2021-03-28', '2021-03-28'),
	(1194, 2, 15, '6000', '2021-03-28', '2021-03-28'),
	(1195, 2, 22, '6010', '2021-03-28', '2021-03-28'),
	(1196, 2, 23, '6020', '2021-03-28', '2021-03-28'),
	(1197, 2, 16, '7000', '2021-03-28', '2021-03-28'),
	(1198, 2, 24, '7010', '2021-03-28', '2021-03-28'),
	(1199, 2, 25, '7020', '2021-03-28', '2021-03-28'),
	(1200, 2, 17, '8000', '2021-03-28', '2021-03-28'),
	(1201, 2, 26, '8010', '2021-03-28', '2021-03-28'),
	(1202, 2, 27, '8020', '2021-03-28', '2021-03-28'),
	(1203, 2, 35, '11000', '2021-03-28', '2021-03-28'),
	(1204, 2, 36, '11010', '2021-03-28', '2021-03-28'),
	(1205, 2, 38, '11030', '2021-03-28', '2021-03-28'),
	(1206, 2, 40, '12000', '2021-03-28', '2021-03-28'),
	(1207, 2, 41, '12010', '2021-03-28', '2021-03-28'),
	(1208, 2, 43, '13000', '2021-03-28', '2021-03-28'),
	(1209, 2, 45, '13020', '2021-03-28', '2021-03-28'),
	(1210, 2, 46, '13030', '2021-03-28', '2021-03-28'),
	(1211, 2, 48, '14000', '2021-03-28', '2021-03-28'),
	(1212, 2, 50, '14020', '2021-03-28', '2021-03-28');
/*!40000 ALTER TABLE `t_permission` ENABLE KEYS */;


-- 导出  表 teaimsdb.t_project 结构
CREATE TABLE IF NOT EXISTS `t_project` (
  `pid` int(10) NOT NULL AUTO_INCREMENT COMMENT '项目id',
  `pno` varchar(30) NOT NULL COMMENT '项目编号',
  `pname` varchar(50) NOT NULL COMMENT '项目名称',
  `tid` int(10) NOT NULL COMMENT '负责人id',
  `pgrade` varchar(10) NOT NULL COMMENT '项目级别',
  `pkind` varchar(10) NOT NULL COMMENT '项目类型',
  `pfunds` double NOT NULL COMMENT '项目经费',
  `participants` varchar(200) NOT NULL COMMENT '参与人',
  `pstatime` date NOT NULL COMMENT '立项时间',
  `pendtime` date NOT NULL COMMENT '结项时间',
  `pcondition` bit(1) NOT NULL COMMENT '科研状态 0未完成 1已完成',
  `psource` varchar(50) NOT NULL COMMENT '项目来源',
  `paccessory` varchar(255) DEFAULT NULL COMMENT '项目附件url地址',
  `kytype` varchar(10) NOT NULL COMMENT '科研类型',
  `result` varchar(50) NOT NULL COMMENT '科研项目成果形式',
  `paudit` bit(1) DEFAULT NULL COMMENT '项目审核状态',
  `message` varchar(200) DEFAULT NULL COMMENT '审核意见',
  `premark` varchar(300) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`pid`),
  KEY `tid` (`tid`),
  CONSTRAINT `t_project_ibfk_1` FOREIGN KEY (`tid`) REFERENCES `t_teacher` (`tid`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COMMENT='科研项目表';

-- 正在导出表  teaimsdb.t_project 的数据：~7 rows (大约)
DELETE FROM `t_project`;
/*!40000 ALTER TABLE `t_project` DISABLE KEYS */;
INSERT INTO `t_project` (`pid`, `pno`, `pname`, `tid`, `pgrade`, `pkind`, `pfunds`, `participants`, `pstatime`, `pendtime`, `pcondition`, `psource`, `paccessory`, `kytype`, `result`, `paudit`, `message`, `premark`) VALUES
	(2, 'IT_PJ201301', 'C-AOC-V2系统', 10, '省级', '开发项目', 100000, '刘洋，沈斌，付燕军', '2018-06-05', '2018-08-16', b'1', '企业自行开发', 'F:/uploadFile/', '系统开发', '应用软件', b'1', '通过', '软件升级版本维护'),
	(3, 'IT_PJ201803', 'C-RSP系统', 10, '省级', '开发项目', 50000, '刘洋，沈斌，付燕军', '2018-06-06', '2018-08-24', b'1', '企业自行开发', '', '系统开发', '应用软件', b'1', '审核通过', 'xxxxxxxxxxxxxxxxxxxxxxxxxx'),
	(4, 'IT_PJ202007', '人力资源系统', 18, '省级', '开发项目', 100000, '胡广杨，刘利君，许芳', '2020-02-13', '2021-05-20', b'1', '企业自行开发', '', '系统开发', '应用软件', b'0', '审核不通过，请重新提交', 'xxxxxxxxxxxxxxxx'),
	(5, 'IT_PJ201306', 'C-RSP7系统', 24, '市级', '科研项目', 50000, '刘洋，沈斌，付燕军', '2013-06-12', '2013-10-17', b'1', '市计划', 'upload/a3b9f3d7-027b-4f45-a610-ee64772d31f6.docx', '系统开发', '应用软件', b'0', '审核不通过，请重新提交', 'xxxxxxxxxxxx'),
	(6, 'IT_PJ201311', 'C-RSP9系统', 24, '市级', '开发项目', 50000, '刘洋，沈斌，付燕军', '2013-11-20', '2014-01-14', b'1', '市计划', 'upload/79b1fb18-1d9b-4856-beda-a2ab9d925b8b.docx', '系统开发', '应用软件', b'1', '通过', 'xxxxxxxxxxx'),
	(7, 'IT_PJ201508', 'SRM系统', 10, '省级', '其他', 100000, '胡广杨，刘利君，许芳', '2015-08-12', '2015-10-15', b'1', '省计划', '', '其他', '应用软件', NULL, NULL, 'SRM管理系统'),
	(8, 'IT_PJ201301', 'C-RSPV系统', 10, '市级', '其他', 100000, '尹静，刘飞，萧河', '2021-03-10', '2021-06-07', b'1', '省计划', 'upload/9a84044a-f553-4840-abde-9b0115c6df28.jpg', '其他', '应用软件', b'1', '审核通过', 'xxxxxxxxxx');
/*!40000 ALTER TABLE `t_project` ENABLE KEYS */;


-- 导出  表 teaimsdb.t_research 结构
CREATE TABLE IF NOT EXISTS `t_research` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '课题id',
  `research_title` varchar(50) NOT NULL COMMENT '研究课题名称',
  `tid` int(10) NOT NULL COMMENT '负责人id',
  `retype` varchar(20) NOT NULL COMMENT '研究类别',
  `scontent` varchar(200) NOT NULL COMMENT '主要研究内容',
  `starttime` date NOT NULL COMMENT '开题时间',
  `endtime` date NOT NULL COMMENT '结束时间',
  `restate` bit(1) NOT NULL COMMENT '课题状态',
  `paudit` bit(1) DEFAULT NULL COMMENT '审核状态(1审核通过，0审核不通过)',
  `paccessory` varchar(100) DEFAULT NULL COMMENT '附件',
  `message` varchar(200) DEFAULT NULL COMMENT '审核意见',
  `remark` varchar(300) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`),
  KEY `tid` (`tid`),
  CONSTRAINT `t_research_ibfk_1` FOREIGN KEY (`tid`) REFERENCES `t_teacher` (`tid`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COMMENT='课题研究表';

-- 正在导出表  teaimsdb.t_research 的数据：~5 rows (大约)
DELETE FROM `t_research`;
/*!40000 ALTER TABLE `t_research` DISABLE KEYS */;
INSERT INTO `t_research` (`id`, `research_title`, `tid`, `retype`, `scontent`, `starttime`, `endtime`, `restate`, `paudit`, `paccessory`, `message`, `remark`) VALUES
	(1, 'PICCO监测在重度脓毒症患者中液体管理的应用研究', 20, '临床医学', 'PICCO监测在重度脓毒症患者中液体管理的应用', '2017-05-12', '2017-08-09', b'1', b'1', '', 'non-OK', 'xxxxxxxxxxxxxxxxxxxx'),
	(2, '14C-尿素呼气试验检测幽门螺杆菌的临床价值', 20, '临床医学', '幽门螺杆菌的临床价值', '2017-10-11', '2017-12-22', b'1', b'1', '', 'dgwefew', 'xxxxxxxxxxxxxxxxx'),
	(4, '负压辅助愈合系统(VAC)在糖尿病足溃疡患者的家庭应用研究', 20, '临床医学', '负压辅助愈合系统(VAC)在糖尿病足溃疡患者的家庭应用研究', '2015-06-10', '2015-07-16', b'1', b'1', '', 'xxfwefef', 'hhhhhhhhhhhhhhhhhhhh'),
	(5, '肺癌化疗患者营养不良的危险因素分析及营养护理对策研究', 20, '临床医学', '肺癌化疗患者营养不良的危险因素分析及营养护理对策研究', '2015-06-11', '2015-07-17', b'1', b'1', '', 'xxxxxdsdxsd', 'xxxxxxx未完成#########3'),
	(6, '1.5T MR3D-SPACE序列在膝关节半月板损伤中的诊断价值', 20, '临床医学', '1.5T MR3D-SPACE序列在膝关节半月板损伤中的诊断价值', '2020-09-24', '2020-11-11', b'1', b'1', '', 'xxfsfefe', 'xxxxxxxxxhehhehehehehe'),
	(8, '计算机图像识别技术的应用分析', 12, '计算机科学', '计算机图像识别', '2017-06-09', '2017-08-10', b'1', NULL, '', NULL, 'xxxxxxxxxxxxxx');
/*!40000 ALTER TABLE `t_research` ENABLE KEYS */;


-- 导出  表 teaimsdb.t_role 结构
CREATE TABLE IF NOT EXISTS `t_role` (
  `rid` int(10) NOT NULL AUTO_INCREMENT COMMENT '角色id',
  `role_name` varchar(20) NOT NULL COMMENT '角色名称',
  `role_desc` varchar(20) NOT NULL COMMENT '角色描述',
  `create_time` date DEFAULT NULL COMMENT '创建时间',
  `update_time` date DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`rid`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 COMMENT='角色信息表';

-- 正在导出表  teaimsdb.t_role 的数据：~2 rows (大约)
DELETE FROM `t_role`;
/*!40000 ALTER TABLE `t_role` DISABLE KEYS */;
INSERT INTO `t_role` (`rid`, `role_name`, `role_desc`, `create_time`, `update_time`) VALUES
	(2, '教师', '教师职工', '2021-02-21', '2021-02-21'),
	(7, '教研室主任', '教研室主任', '2021-03-13', '2021-03-13');
/*!40000 ALTER TABLE `t_role` ENABLE KEYS */;


-- 导出  表 teaimsdb.t_schedule 结构
CREATE TABLE IF NOT EXISTS `t_schedule` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id编号',
  `cid` int(11) NOT NULL COMMENT '课程id',
  `tid` int(11) NOT NULL COMMENT '教师id',
  `rid` int(11) NOT NULL COMMENT '教研室id',
  `class_year` varchar(20) NOT NULL COMMENT '学年',
  `class_term` varchar(20) NOT NULL COMMENT '学期',
  `class_work_day` varchar(10) NOT NULL COMMENT '上课工作日',
  `class_num` varchar(10) NOT NULL COMMENT '上课节数',
  `start_week` int(11) NOT NULL COMMENT '起始周数',
  `class_week` int(11) NOT NULL COMMENT '上课周数',
  `is_single_week` bit(1) DEFAULT NULL COMMENT '是否单周',
  `is_double_week` bit(1) DEFAULT NULL COMMENT '是否双周',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 COMMENT='授课时间表';

-- 正在导出表  teaimsdb.t_schedule 的数据：~2 rows (大约)
DELETE FROM `t_schedule`;
/*!40000 ALTER TABLE `t_schedule` DISABLE KEYS */;
INSERT INTO `t_schedule` (`id`, `cid`, `tid`, `rid`, `class_year`, `class_term`, `class_work_day`, `class_num`, `start_week`, `class_week`, `is_single_week`, `is_double_week`) VALUES
	(3, 2, 10, 2, '2008-2009学年', '第二学期', '周二', '第一大节', 1, 15, b'1', b'0'),
	(4, 1, 10, 2, '2021-2022学年', '第二学期', '周一', '第二大节', 1, 15, b'1', b'1'),
	(5, 1, 11, 3, '2002-2003学年', '第二学期', '周三', '第三大节', 1, 15, b'1', b'1'),
	(6, 4, 31, 1, '2015-2016学年', '第二学期', '周四', '第二大节', 1, 15, b'1', b'1'),
	(7, 14, 31, 2, '2018-2019学年', '第一学期', '周四', '第三大节', 2, 15, b'1', b'1');
/*!40000 ALTER TABLE `t_schedule` ENABLE KEYS */;


-- 导出  表 teaimsdb.t_teach 结构
CREATE TABLE IF NOT EXISTS `t_teach` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id编号',
  `tid` int(11) NOT NULL COMMENT '教师id',
  `cid` int(11) NOT NULL COMMENT '课程id',
  `teach_type` varchar(10) NOT NULL COMMENT '授课方式',
  `teach_class_year` varchar(20) NOT NULL COMMENT '授课学年',
  `teach_class_term` varchar(10) NOT NULL COMMENT '授课学期',
  `teach_grade` varchar(10) NOT NULL COMMENT '授课年级',
  `teach_major` varchar(20) NOT NULL COMMENT '授课专业',
  `start_college` varchar(20) NOT NULL COMMENT '开设学院',
  `start_dept` varchar(20) NOT NULL COMMENT '开设系部',
  `prescribed_class_hour` int(11) DEFAULT NULL COMMENT '规定学时',
  `actual_class_hour` int(11) DEFAULT NULL COMMENT '实际学时',
  `actual_teach_class_hour` int(11) DEFAULT NULL COMMENT '实际讲授学时',
  `actual_experiment_class_hour` int(11) DEFAULT NULL COMMENT '实际实验学时',
  `actual_computer_class_hour` int(11) DEFAULT NULL COMMENT '实际上机学时',
  `actual_other_class_hour` int(11) DEFAULT NULL COMMENT '实际其他学时',
  `actual_sumup_class_hour` int(11) DEFAULT NULL COMMENT '实际总学时',
  `audit_state` bit(1) DEFAULT NULL COMMENT '审核状态',
  `message` varchar(50) DEFAULT NULL COMMENT '审核意见',
  `remark` varchar(100) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8 COMMENT='授课信息表';

-- 正在导出表  teaimsdb.t_teach 的数据：~2 rows (大约)
DELETE FROM `t_teach`;
/*!40000 ALTER TABLE `t_teach` DISABLE KEYS */;
INSERT INTO `t_teach` (`id`, `tid`, `cid`, `teach_type`, `teach_class_year`, `teach_class_term`, `teach_grade`, `teach_major`, `start_college`, `start_dept`, `prescribed_class_hour`, `actual_class_hour`, `actual_teach_class_hour`, `actual_experiment_class_hour`, `actual_computer_class_hour`, `actual_other_class_hour`, `actual_sumup_class_hour`, `audit_state`, `message`, `remark`) VALUES
	(10, 10, 2, '讲授+上机', '2008-2009学年', '第二学期', '大二', '计算机科学与技术', '信息工程学院', '计算机系', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	(11, 10, 1, '讲授+上机', '2021-2022学年', '第二学期', '大一', '计算机科学与技术', '信息工程学院', '计算机系', 30, 60, 30, 0, 30, 0, 60, b'1', '审核通过', 'xxx'),
	(12, 11, 1, '讲授+上机', '2002-2003学年', '第二学期', '大一', '计算机科学与技术', '信息工程学院', '计算机系', 30, 90, 45, 0, 45, 0, 90, b'1', 'xxxx', 'xxxxx'),
	(13, 31, 4, '讲授', '2015-2016学年', '第二学期', '大二', '数学与应用数学', '数学与计算科学学院', '数学系', 60, 60, 45, 0, 0, 15, 60, b'0', 'xxxxxha', 'xxxx'),
	(14, 31, 14, '讲授', '2018-2019学年', '第一学期', '大二', '计算机科学', '信息工程学院', '计算机系', NULL, NULL, NULL, NULL, NULL, NULL, NULL, b'1', '审核通过', NULL);
/*!40000 ALTER TABLE `t_teach` ENABLE KEYS */;


-- 导出  表 teaimsdb.t_teacher 结构
CREATE TABLE IF NOT EXISTS `t_teacher` (
  `tid` int(10) NOT NULL AUTO_INCREMENT COMMENT '教师id',
  `teacher_no` varchar(10) NOT NULL COMMENT '教师职工编号',
  `teacher_name` varchar(20) NOT NULL COMMENT '教师姓名',
  `teacher_engname` varchar(50) NOT NULL COMMENT '教师英文名',
  `sex` char(3) NOT NULL COMMENT '性别',
  `major` varchar(50) NOT NULL COMMENT '所学专业',
  `degree` varchar(10) NOT NULL COMMENT '最高学历',
  `school` varchar(20) NOT NULL COMMENT '教育背景',
  `birth` date NOT NULL COMMENT '出生日期',
  `phone` varchar(11) NOT NULL COMMENT '电话号码',
  `email` varchar(20) NOT NULL COMMENT '邮箱',
  `research_direction` varchar(50) NOT NULL COMMENT '研究方向',
  `id_num` varchar(20) NOT NULL COMMENT '身份证号',
  `family_address` varchar(255) NOT NULL COMMENT '家庭住址',
  `politics_status` varchar(10) NOT NULL COMMENT '政治面貌',
  `collegeid` int(10) NOT NULL COMMENT '学院id',
  `deptid` int(10) NOT NULL COMMENT '系部id',
  `valid_state` bit(1) NOT NULL COMMENT '是否在职',
  `occupation` varchar(10) NOT NULL COMMENT '职称',
  `is_foreign` bit(1) NOT NULL COMMENT '是否为外聘教师',
  `photo_url` varchar(255) NOT NULL COMMENT '个人证件照url地址',
  PRIMARY KEY (`tid`),
  KEY `tname` (`teacher_name`),
  KEY `collegeid` (`collegeid`),
  KEY `deptid` (`deptid`),
  CONSTRAINT `t_teacher_ibfk_1` FOREIGN KEY (`collegeid`) REFERENCES `t_college` (`college_id`),
  CONSTRAINT `t_teacher_ibfk_2` FOREIGN KEY (`deptid`) REFERENCES `t_dept` (`dept_id`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8 COMMENT='教师基本信息表';

-- 正在导出表  teaimsdb.t_teacher 的数据：~15 rows (大约)
DELETE FROM `t_teacher`;
/*!40000 ALTER TABLE `t_teacher` DISABLE KEYS */;
INSERT INTO `t_teacher` (`tid`, `teacher_no`, `teacher_name`, `teacher_engname`, `sex`, `major`, `degree`, `school`, `birth`, `phone`, `email`, `research_direction`, `id_num`, `family_address`, `politics_status`, `collegeid`, `deptid`, `valid_state`, `occupation`, `is_foreign`, `photo_url`) VALUES
	(1, '0101118', '王天人', 'wang tianren', '男', '社会学', '硕士', '南开大学', '1988-07-18', '18670912241', '2554868334@qq.com', '社会工程学', '366139198807202931', '北京市海淀区xxxxxxx', '党员', 1, 1, b'1', '教授', b'0', ''),
	(10, '0202346', '杨振华', 'yang zhenhua', '男', '软件工程', '硕士', '南京大学', '1982-10-13', '13584886684', '3748387431@qq.com', '人工智能', '360633198606100072', '江苏省南京市xxxxx', '党员', 2, 2, b'1', '讲师', b'0', ''),
	(11, '0202208', 'Lucy', 'Lucy', '女', '软件工程', '硕士', '南京大学', '1987-03-06', '13584886684', '3748387431@qq.com', '人工智能', '360421198703064456', '湖北省武汉市xxxxx', '党员', 2, 2, b'1', '讲师', b'0', 'upload/2b2b230f-64a3-4930-aa1f-739a35c6c362.jpg'),
	(12, '0202415', 'Lily', 'Lily', '女', '软件工程', '硕士', '南京大学', '1990-06-11', '15583830932', '373832231@qq.com', '人工智能111', '360323199006134803', '广州市番禺区xxxxx111', '党员', 2, 2, b'1', '讲师', b'0', ''),
	(17, 'L0202003', 'Smith', 'Smith', '男', '软件工程', '硕士', '南京大学', '1991-07-09', '18673920427', '373832231@qq.com', '人工智能', '360921199107104720', '广州市番禺区xxxxx', '群众', 2, 2, b'0', '讲师', b'1', ''),
	(18, '0202457', '王华', 'wang hua', '男', '软件工程', '硕士', '北京大学', '1987-06-01', '13584886684', '3748387431@qq.com', '人工智能', '365137198706048735', '北京海淀区xxxxxx', '党员', 2, 2, b'1', '副教授', b'0', ''),
	(19, '0404703', '许世昌', 'xu shichang', '男', '钢铁冶金', '硕士', '东北大学', '1976-07-04', '18553364386', '3745833431@qq.com', '金属冶炼与加工', '360621197607040843', '河南省安徽省合肥市庐阳区朝景路香颂小区22栋1003室', '党员', 4, 4, b'1', '副教授', b'0', ''),
	(20, '0505909', '郑仁心', 'zheng renxin', '男', '临床医学', '硕士', '南京医科大学', '1975-11-13', '18504983682', '3748387431@qq.com', '临床医学 外科医学', '360432197511130451', '江苏省南京市xxxxx', '党员', 5, 5, b'1', '副教授', b'0', ''),
	(21, '0202327', '张阅', 'zhang yue', '男', '软件工程', '硕士', '北京大学', '1989-07-12', '15536846624', '2057473561@qq.com', '人工智能', '364139198907132592', '湖北省武汉市xxxxx', '党员', 2, 2, b'1', '副教授', b'0', ''),
	(22, '0202598', '辛然', 'xin ran', '男', '软件工程', '硕士', '南京大学', '1992-09-17', '15536846624', '2057473561@qq.com', '人工智能', '363592199209173812', '湖北省武汉市xxxxx', '党员', 2, 2, b'1', '讲师', b'0', ''),
	(24, '0202572', '李穆', 'Li Mu', '男', '计算机科学与技术', '硕士', '南京信息工程大学', '1986-06-10', '18296875109', '2057473561@qq.com', '计算机系统结构', '360758198506114561', '江苏省南京市xxxxxx', '党员', 2, 2, b'1', '副教授', b'0', 'upload/9d8ab15c-1e78-4127-97b9-b1342da2cbc2.png'),
	(25, '0202051', '刘子豪', 'Liu ZiHao', '男', '计算机科学与技术', '硕士', '南京大学', '1984-07-12', '18296875109', '2057473561@qq.com', '计算机系统结构', '360628198407124375', '江苏省南京市xxxxxx', '党员', 2, 2, b'1', '副教授', b'0', 'upload/3ee84f7e-e2de-4694-a385-1c15f920c173.png'),
	(26, '0202225', '李明', 'Li Ming', '男', '计算机科学与技术', '硕士', '南京大学', '1984-07-03', '18296875109', '2057473561@qq.com', '计算机系统结构', '363458198407030089', '江苏省南京市xxxxxx', '党员', 2, 2, b'1', '副教授', b'0', 'upload/2c40d612-3b8a-48f9-9cdf-1bcd9c0f1a3d.png'),
	(27, '0202245', '廖清', 'Liao qing', '男', '软件工程', '硕士', '南京大学', '1985-06-12', '15536846624', '2057473561@qq.com', '人工智能', '360323198506127731', '湖北省武汉市xxxxx', '党员', 2, 2, b'1', '副教授', b'0', ''),
	(28, '0302338', '李华', 'Li hua', '男', '经济学', '硕士', '上海财经大学', '1987-03-12', '15536846624', '2057473561@qq.com', '人工智能', '366232198703127372', '湖北省武汉市xxxxx', '党员', 3, 2, b'1', '副教授', b'0', 'upload/005137b5-0c15-45ca-ad44-cd3766c4b3d3.jpg'),
	(29, '0303884', '许金华', 'Xu jinhua', '男', '经济学', '硕士', '上海财经大学', '1990-10-28', '15536846624', '2057473561@qq.com', '经济贸易', '360837199010280018', '湖北省武汉市xxxxx', '党员', 3, 3, b'1', '副教授', b'0', 'upload/90ae5db7-9f4b-43e0-b7fb-afd92364a395.jpg'),
	(30, '0202058', '林晓', 'Lin xiao', '男', '软件工程', '硕士', '南京大学', '1988-06-07', '13584886684', '3748387431@qq.com', '人工智能', '360232198806080172', '江苏省南京市xxxxx', '党员', 2, 2, b'1', '副教授', b'0', 'upload/8fc41c2d-f434-4671-9ecf-37de1e992afc.jpg'),
	(31, '0202742', '王英章', 'wang yingzhang', '男', '应用数学', '硕士', '南京大学', '1985-05-08', '18739304501', '2748387431@qq.com', '应用数学', '360432198505080453', '江苏省南京市xxxxx', '党员', 6, 6, b'1', '副教授', b'0', '');
/*!40000 ALTER TABLE `t_teacher` ENABLE KEYS */;


-- 导出  表 teaimsdb.t_teach_room 结构
CREATE TABLE IF NOT EXISTS `t_teach_room` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `teach_room_name` varchar(30) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='教研室信息表';

-- 正在导出表  teaimsdb.t_teach_room 的数据：~4 rows (大约)
DELETE FROM `t_teach_room`;
/*!40000 ALTER TABLE `t_teach_room` DISABLE KEYS */;
INSERT INTO `t_teach_room` (`id`, `teach_room_name`) VALUES
	(1, 'M101'),
	(2, 'S101'),
	(3, 'M111'),
	(4, 'M108');
/*!40000 ALTER TABLE `t_teach_room` ENABLE KEYS */;


-- 导出  表 teaimsdb.t_user 结构
CREATE TABLE IF NOT EXISTS `t_user` (
  `uid` int(10) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `username` varchar(10) NOT NULL COMMENT '用户名',
  `usertruename` varchar(20) NOT NULL COMMENT '用户真实姓名',
  `password` varchar(50) NOT NULL COMMENT '用户密码',
  `roleid` int(10) NOT NULL,
  `is_valid` bit(1) NOT NULL COMMENT '用户是否有效',
  `create_time` date DEFAULT NULL COMMENT '创建时间',
  `update_time` date DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`uid`),
  UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=38 DEFAULT CHARSET=utf8 COMMENT='用户信息表';

-- 正在导出表  teaimsdb.t_user 的数据：~18 rows (大约)
DELETE FROM `t_user`;
/*!40000 ALTER TABLE `t_user` DISABLE KEYS */;
INSERT INTO `t_user` (`uid`, `username`, `usertruename`, `password`, `roleid`, `is_valid`, `create_time`, `update_time`) VALUES
	(2, '0101118', '王天人', 'ICy5YqxZB1uWSwcVLSNLcA==', 0, b'1', '2021-01-24', '2021-02-21'),
	(3, 'admin', 'admin', 'ICy5YqxZB1uWSwcVLSNLcA==', 0, b'0', '2021-01-24', '2021-01-24'),
	(11, '0202346', '杨振华', 'ICy5YqxZB1uWSwcVLSNLcA==', 0, b'1', '2021-01-30', '2021-03-07'),
	(12, '0202208', 'Lucy', 'ICy5YqxZB1uWSwcVLSNLcA==', 0, b'1', '2021-01-30', '2021-03-02'),
	(13, '0202415', 'Lily', 'ICy5YqxZB1uWSwcVLSNLcA==', 0, b'1', '2021-01-30', '2021-02-17'),
	(18, 'L0202003', 'Smith', 'ICy5YqxZB1uWSwcVLSNLcA==', 0, b'0', '2021-01-30', '2021-01-30'),
	(19, '0202457', '王华', 'ICy5YqxZB1uWSwcVLSNLcA==', 0, b'1', '2021-02-04', '2021-02-19'),
	(20, '0404703', '许世昌', 'ICy5YqxZB1uWSwcVLSNLcA==', 0, b'1', '2021-02-06', '2021-02-06'),
	(21, '0505909', '郑仁心', 'ICy5YqxZB1uWSwcVLSNLcA==', 0, b'1', '2021-02-07', '2021-02-07'),
	(22, '0202327', '张阅', 'ICy5YqxZB1uWSwcVLSNLcA==', 0, b'1', '2021-02-10', '2021-02-10'),
	(23, '0202598', '辛然', 'ICy5YqxZB1uWSwcVLSNLcA==', 0, b'1', '2021-02-10', '2021-02-10'),
	(30, '0202572', '李穆', 'ICy5YqxZB1uWSwcVLSNLcA==', 2, b'1', '2021-02-21', '2021-02-21'),
	(31, '0202051', '刘子豪', 'gdyb21LQTcIANtvYMT7QVQ==', 2, b'1', '2021-02-21', '2021-02-24'),
	(32, '0202225', '李明', 'ICy5YqxZB1uWSwcVLSNLcA==', 2, b'1', '2021-02-24', '2021-02-24'),
	(33, '0202245', '廖清', 'ICy5YqxZB1uWSwcVLSNLcA==', 2, b'1', '2021-02-24', '2021-02-24'),
	(34, '0302338', '李华', 'ICy5YqxZB1uWSwcVLSNLcA==', 2, b'1', '2021-02-24', '2021-02-24'),
	(35, '0303884', '许金华', 'ICy5YqxZB1uWSwcVLSNLcA==', 2, b'1', '2021-02-24', '2021-02-24'),
	(36, '0202058', '林晓', 'ICy5YqxZB1uWSwcVLSNLcA==', 2, b'1', '2021-02-24', '2021-02-24'),
	(37, '0202742', '王英章', 'ICy5YqxZB1uWSwcVLSNLcA==', 2, b'1', '2021-03-20', '2021-03-20');
/*!40000 ALTER TABLE `t_user` ENABLE KEYS */;


-- 导出  表 teaimsdb.t_user_role 结构
CREATE TABLE IF NOT EXISTS `t_user_role` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `userid` int(10) NOT NULL COMMENT '用户id',
  `roleid` int(10) NOT NULL COMMENT '角色id',
  `create_time` date DEFAULT NULL COMMENT '创建时间',
  `update_time` date DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`),
  KEY `userid` (`userid`),
  KEY `roleid` (`roleid`),
  CONSTRAINT `t_user_role_ibfk_1` FOREIGN KEY (`userid`) REFERENCES `t_user` (`uid`),
  CONSTRAINT `t_user_role_ibfk_2` FOREIGN KEY (`roleid`) REFERENCES `t_role` (`rid`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8 COMMENT='用户角色关联表';

-- 正在导出表  teaimsdb.t_user_role 的数据：~8 rows (大约)
DELETE FROM `t_user_role`;
/*!40000 ALTER TABLE `t_user_role` DISABLE KEYS */;
INSERT INTO `t_user_role` (`id`, `userid`, `roleid`, `create_time`, `update_time`) VALUES
	(6, 11, 2, '2021-02-17', '2021-02-17'),
	(12, 13, 2, '2021-02-17', '2021-02-17'),
	(18, 2, 2, '2021-02-21', '2021-02-21'),
	(19, 30, 2, '2021-02-21', '2021-02-21'),
	(20, 31, 2, '2021-02-21', '2021-02-21'),
	(21, 32, 2, '2021-02-24', '2021-02-24'),
	(24, 36, 2, '2021-02-24', '2021-02-24'),
	(26, 12, 7, '2021-03-02', '2021-03-02');
/*!40000 ALTER TABLE `t_user_role` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
