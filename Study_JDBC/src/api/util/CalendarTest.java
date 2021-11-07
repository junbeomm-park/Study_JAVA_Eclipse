package api.util;

import java.util.Calendar;
import java.util.GregorianCalendar;

//날짜시간에 대한 작업
public class CalendarTest {
	public static void main(String[] args) {
		//현재 날짜와 시간 정보를 표현한 객체
		Calendar cal = new GregorianCalendar();
		System.out.println(cal);
		
		System.out.print(cal.get(Calendar.YEAR)+"년 ");
		System.out.print((cal.get(Calendar.MONTH)+1)+"월 ");
		System.out.print(cal.get(Calendar.DATE)+"일 ");
		System.out.print(cal.get(Calendar.SECOND)+"시 ");
		System.out.print(cal.get(Calendar.MINUTE)+"분 ");
		System.out.println(cal.get(Calendar.SECOND)+"초 ");
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.getTimeInMillis());
		System.out.println(cal.getTimeInMillis()/1000/60/60/24/30/12);
		
		//오늘부터 9월/21까지 d-day 구하기
		//=> 오늘날짜객체, 9/21객체 두 개가 필요
		
        //1. Calendar 객체 두 개 만들기
		Calendar today = new GregorianCalendar();
		Calendar dday = new GregorianCalendar();
		Calendar dday2 = new GregorianCalendar(2021, 8, 21);
		
		//2. 하나의 Calendar객체를 9월21로 셋팅
		dday.set(2021, 8, 21);
		
		System.out.print(dday.get(Calendar.HOUR)+"시 ");
		System.out.print(dday.get(Calendar.MINUTE)+"분 ");
		System.out.println(dday.get(Calendar.SECOND)+"초 ");
		
		System.out.print(dday2.get(Calendar.HOUR)+"시 ");
		System.out.print(dday2.get(Calendar.MINUTE)+"분 ");
		System.out.println(dday2.get(Calendar.SECOND)+"초 ");
		
		System.out.println("dday==>"+dday.getTimeInMillis());
		System.out.println("dday2==>"+dday2.getTimeInMillis());
		
		//3. 두 객체의 날짜 차이를 계산
		long ddayValue = dday.getTimeInMillis() - today.getTimeInMillis();
		System.out.println(ddayValue/1000/60/60/24+"일");
		long ddayValue2 = dday2.getTimeInMillis() - today.getTimeInMillis();
		System.out.println(ddayValue2/1000/60/60/24+"일");
		
	
	
	
	
	}
	
	
	
		

	}


