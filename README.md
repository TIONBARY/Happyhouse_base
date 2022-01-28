# member

**pair9**
# 김시언 
# 허설

## Requirements

- 관통 프로젝트
- 자바
- 해피하우스

## Application Structure

- `View`: UI 역할
- `Service`: 비즈니스 로직 구현
- `Dao`: 데이터베이스 접근, 도메인 객체를 DB에 저장하고 관리
- `Dto`: 비즈니스 도메인 객체

## Class Dependencies

![class-diagram](http://www.plantuml.com/plantuml/proxy?src=https://raw.githubusercontent.com/lcalmsky/member/master/class-diagram.puml)


## 결과화면
- 초기화면 
![초기화면](https://user-images.githubusercontent.com/26956570/151531855-879b5af8-bb95-489f-82ef-999c55ce5a4d.png)

- 동으로 검색 시 
![동으로검색](https://user-images.githubusercontent.com/26956570/151531920-f5322660-14f0-4c28-b93e-47be0a4a91eb.png)

- 아파트 이름으로 검색 시 
![아파트이름검색](https://user-images.githubusercontent.com/26956570/151531975-7f552388-b1bc-4196-829c-1bac32779e7c.png)




## 제출 소스
| ClassName  code line No. | code                                                         |
| ------------------------ | :----------------------------------------------------------- |
| HouseInfoView 246~247    | ![1](https://user-images.githubusercontent.com/26956570/151523317-cc18c091-4787-4fea-8a87-97e2a8591792.png) |
| HouseServiceImpl 34      | ![2](https://user-images.githubusercontent.com/26956570/151531263-aeab7853-a90a-48bd-936f-fd1fea4ae111.png) |
| HouseDaoImpl 80 +이미지  | ![3](https://user-images.githubusercontent.com/26956570/151531307-45c889e4-3128-4f95-a0e5-d0ab48e2ebe8.png)                                                     |
| APTRentSAXHandler 28~    | ![4_7](https://user-images.githubusercontent.com/26956570/151531343-455697fe-ff9a-429c-b18c-4f0abbf91e3f.png)                                                         |
| HouseDealSAXHandler 구현 | ![8](https://user-images.githubusercontent.com/26956570/151531705-0f921d38-4771-4d24-9e2d-bfd7f8e12f1e.png) |
