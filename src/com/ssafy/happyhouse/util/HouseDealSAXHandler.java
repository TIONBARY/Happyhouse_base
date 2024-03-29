package com.ssafy.happyhouse.util;

import java.util.LinkedList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

import com.ssafy.happyhouse.model.dto.HouseDeal;

/**
 *  HouseDealHistory.xml 파일에서 주택 거래 정보를 읽어 파싱하는 핸들러 클래스 
 */
public class HouseDealSAXHandler extends DefaultHandler {
	private List<HouseDeal> houses;
	private HouseDeal house;
	private String temp;
	
	public HouseDealSAXHandler(){
		houses = new LinkedList<HouseDeal>();
	}
	// complete code #08
	// APTDealSAXHandler Class 를 참조하여, 주택 거래 정보에 맞도록 전체 코드를 작성하세요. 단, 아래 코드를 이용하여 완성하세요.
	public void startElement(String uri, String localName, String qName, Attributes att ){
		if(qName.equals("item")){
			house = new HouseDeal(HouseSaxParser.no++);
			house.setType(HouseDeal.HOUSE_DEAL);
			houses.add(house);
		}
	}
	public void endElement(String uri, String localName, String qName){
		if(qName.equals("지역코드")) { 
			house.setCode(Integer.parseInt(temp));
		}else if(qName.equals("연립다세대")) { 
			house.setAptName(temp.trim());
		}else if(qName.equals("법정동")) { 
			house.setDong(temp.trim());
		}else if(qName.equals("거래금액")) { 
			house.setDealAmount(temp.trim());
		}else if(qName.equals("대지권면적")) { 
			house.setArea(Double.parseDouble(temp));
		}else if(qName.equals("건축년도")) { 
			house.setBuildYear(Integer.parseInt(temp));
		}else if(qName.equals("년")) { 
			house.setDealYear(Integer.parseInt(temp));
		}else if(qName.equals("월")) { 
			house.setDealMonth(Integer.parseInt(temp));
		}else if(qName.equals("일")) { 
			house.setDealDay(Integer.parseInt(temp));
		}else if(qName.equals("전용면적")) { 
			house.setArea(Double.parseDouble(temp));
		}else if(qName.equals("지번")) { 
			house.setJibun(temp);
		}else if(qName.equals("층")) { 
			house.setFloor(Integer.parseInt(temp));
		}
	}
	public void characters(char[]ch, int start, int length){
		temp = new String(ch, start, length);
	}
	public List<HouseDeal> getHouses() {
		return houses;
	}
	public void setHouses(List<HouseDeal> houses) {
		this.houses = houses;
	}
}





