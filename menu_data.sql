-- --------------------------------------------------------
-- 호스트:                          127.0.0.1
-- 서버 버전:                        8.0.23 - MySQL Community Server - GPL
-- 서버 OS:                        Win64
-- HeidiSQL 버전:                  11.2.0.6213
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

-- 테이블 데이터 testdb.menu:~0 rows (대략적) 내보내기
/*!40000 ALTER TABLE `menu` DISABLE KEYS */;
INSERT INTO `menu` (`id`, `menu_id`, `menu_nm`, `menu_link`, `description`, `alt`, `use_at`, `del_at`, `order_by`, `modified_date`, `created_date`) VALUES
	(1, '10', '솔루션', '/product/list.do?category_id=1', '문제해결 및 운영개선을 위한 기술기반의 제반 제품, 서비스', '솔루션', 'Y', 'N', 1, NULL, NULL),
	(2, '20', '기자재', '/product2/list.do?category_id=2', '플랜트건설 및 운영에 필요한 각종 설비 및 자재', '기자재', 'Y', 'N', 2, NULL, NULL),
	(3, '30', '긴급자재11', '/material/list.do?category_id=3', '긴급한 조달을 필요로하는 기자재 정보', '긴급자재', 'Y', 'N', 3, NULL, NULL),
	(4, '40', '공유자재', '/material2/list2.do?category_id=4', '타사와 공유 또는 처분이 가능한 보유자재 정보', '공유자재', 'Y', 'N', 4, NULL, NULL),
	(5, '50', 'EPC·유지보수', '/product3/list.do?category_id=5', '플랜트 EPC 및 유지보수작업에 대한 전문업체 정보', 'EPC·유지보수', 'Y', 'N', 5, NULL, NULL),
	(6, '60', '리르쿠팅1', '/materialf/list3.do?category_id=3', '플랜트 기술인력 소요정보', '리르쿠팅', 'Y', 'N', 6, NULL, NULL),
	(7, '70', '비즈니스제안', '/qna/viewAdd.do', '아이디어, 사업개발, 마케팅 등 비즈니스영역 전반에 대한 제안', '비즈니스제안', 'Y', 'N', 7, NULL, NULL);
/*!40000 ALTER TABLE `menu` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
