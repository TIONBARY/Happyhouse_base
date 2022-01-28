# member

pair9 김시언 허설

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
![image info](./img/00.PNG)


## 제출 소스
| ClassName  code line No. | code                                                         |
| ------------------------ | :----------------------------------------------------------- |
| HouseInfoView 246~247    | // complete code #01<br/>		// 아래의 코드를 참조하여 아래 라인을 uncomment 하고 searchBt.addActionList() 를 Lambda 표현식으로 바꾸세요.<br/>	// 참조코드 시작 - 위 코드를 완성 후 삭제 또는 comment 처리하세요.<br/> ```searchBt.addActionListener((e)->searchHouses());```<br/>	// 참조코드 종료<br/> |
| HouseServiceImpl 34      | @Override<br/>	public HouseDeal search(int no) {<br/>		<br/>		// complete code #03<br/>		// null 을 return 하면 안됩니다. Dao Layer 의 적절한 method를 호출하여 Business Logic 을 완성하세요.<br/>		
```	public HouseDeal search(int no) { <br/> for (int i = 0; i < search.size(); i++) { </br> if (no == search.get(i).getNo()) { <br/> return search.get(i); <br/>	}<br/>		}<br/>		return null;<br/>	}``` <br/>	 |
| HouseDaoImpl  80         | 못함                                                         |
| APTRentSAXHandler 28~    | 못함                                                         |

