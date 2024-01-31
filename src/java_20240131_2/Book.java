package java_20240131_2;
/*
 * 문제: 도서관 관리 시스템
도서관에서 다양한 종류의 책들을 관리하는 시스템을 자바로 구현하세요. 
여기서는 소설, 교과서, 잡지라는 세 가지 유형의 책을 다룹니다.

기본 요구 사항:
책 클래스 생성

Book이라는 이름의 기본 책 클래스를 만듭니다.
모든 책은 title (제목), author (저자), publishYear (출판 연도) 속성을 가집니다.
Book 클래스에는 getDetails() 메소드가 있어, 책의 상세 정보를 문자열 형태로 반환합니다.

다형성 사용
Book 클래스를 상속받는 세 개의 서브클래스, Novel, Textbook, Magazine을 생성합니다.
각 서브클래스는 getDetails() 메소드를 오버라이드하여 각 책의 유형에 맞는 추가 정보를 출력합니다.
예를 들어, Novel은 장르를, Textbook은 학문 분야를, Magazine은 발행 주기를 추가 정보로 가집니다.

도서관 책 관리 시뮬레이션
main 메소드에서 다양한 종류의 책을 생성합니다.
생성된 각 책에 대해 getDetails()를 호출하여 해당 책의 상세 정보를 출력합니다.
 */
public class Book {
	
	private String title;
	private String author;
	private String publishYear;
	
	public Book() {	}
	public Book(String title, String author, String publishYear){
		this.title = title;
		this.author = author;
		this.publishYear = publishYear;
	}
	
	public void getDetails() {
		System.out.println("제목 : " + title);
		System.out.println("저자 : " + author);
		System.out.println("출판 연도 : " + publishYear);
	}
	
}
